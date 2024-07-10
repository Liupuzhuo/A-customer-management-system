
package com.example.common.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;    
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.example.common.util.SpringUtils;
import com.example.common.filter.MyCorsFilter;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    /**
     * 跨域设置
     * @return
     */
    @Bean
    public FilterRegistrationBean<MyCorsFilter> myCorsFilter() {
        FilterRegistrationBean<MyCorsFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new MyCorsFilter());
        registration.addUrlPatterns("/*");
        registration.setName(MyCorsFilter.class.getSimpleName());
        registration.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return registration;
    }      

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }
}