package org.example.spring_lessons.config;

import org.springframework.context.annotation.Bean;

public class DemoConfiguration {

    @Bean
    public String testProductName() {
        return "product";
    }
}
