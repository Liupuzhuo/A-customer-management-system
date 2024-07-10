package com.example.common.util;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * Utility class for accessing HttpServletRequest and Spring Beans in a Spring application.
 */
@Component
public final class SpringUtils implements ApplicationContextAware, EnvironmentAware {

    private volatile static ApplicationContext applicationContext;
    private volatile static Environment environment;

    /**
     * Get the current HttpServletRequest object.
     *
     * @return The current HttpServletRequest object.
     */
    public static HttpServletRequest getServletRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }


    /**
     * Get a bean instance by its name from the Spring container.
     *
     * @param name The name of the bean.
     * @return The bean instance.
     * @throws BeansException If the bean cannot be found or retrieved.
     */
    public static <T> T getBean(String name) {
        return (T) applicationContext.getBean(name);
    }

    /**
     * Get a bean instance by its class from the Spring container.
     *
     * @param clz The class of the bean.
     * @return The bean instance.
     * @throws BeansException If the bean cannot be found or retrieved.
     */
    public static <T> T getBean(Class<T> clz) throws BeansException {
        T result = (T) applicationContext.getBean(clz);
        return result;
    }

    /**
     * Check if a bean with the given name exists in the Spring container.
     *
     * @param name The name of the bean.
     * @return true if the bean exists, false otherwise.
     */
    public static boolean containsBean(String name) {
        return applicationContext.containsBean(name);
    }

    /**
     * Check if a bean with the given name is a singleton in the Spring container.
     *
     * @param name The name of the bean.
     * @return true if the bean is a singleton, false otherwise.
     * @throws NoSuchBeanDefinitionException If the bean definition cannot be found.
     */
    public static boolean isSingleton(String name) throws NoSuchBeanDefinitionException {
        return applicationContext.isSingleton(name);
    }

    /**
     * Get the type of the bean with the given name in the Spring container.
     *
     * @param name The name of the bean.
     * @return The type of the bean.
     * @throws NoSuchBeanDefinitionException If the bean definition cannot be found.
     */
    public static Class<?> getType(String name) throws NoSuchBeanDefinitionException {
        return applicationContext.getType(name);
    }

    /**
     * Get the aliases for the bean with the given name in the Spring container.
     *
     * @param name The name of the bean.
     * @return An array of aliases for the bean.
     * @throws NoSuchBeanDefinitionException If the bean definition cannot be found.
     */
    public static String[] getAliases(String name) throws NoSuchBeanDefinitionException {
        return applicationContext.getAliases(name);
    }

    /**
     * publish event
     * @param event
     */
    public static void publishEvent(ApplicationEvent event) {
        applicationContext.publishEvent(event);
    }

    /**
     * Get config env value by key
     * @param key
     * @return
     */
    public static String getConfigEnv(String key) {
        return environment.getProperty(key);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringUtils.applicationContext = applicationContext;
    }

    @Override
    public void setEnvironment(Environment environment) {
        SpringUtils.environment = environment;
    }
}