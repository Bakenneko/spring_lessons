package org.example.spring_lessons.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {

    @Bean
    public String testProductName() {
        return "product";
    }
}
