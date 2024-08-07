package com.example.common.config;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Configuration
public class LocalDateTimeSerializerConfig {

    static {
        Locale.setDefault(Locale.CHINA);
    }

    @Value("${spring.jackson.date-format:yyyy-MM-dd HH:mm:ss}")
    private String pattern;


    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jackson2ObjectMapperBuilderCustomizer() {
        return customizer->{
            customizer.serializerByType(LocalDateTime.class,new LocalDateTimeSerializer(
                    DateTimeFormatter.ofPattern(pattern)));
            customizer.deserializerByType(LocalDateTime.class,new LocalDateTimeDeserializer(
                    DateTimeFormatter.ofPattern(pattern)));
        };
    }
}
