package com.example.todo.service.mapper.developerMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeveloperMapperConfig {

    @Bean
    public DeveloperMapper developerMapper() {
        return new DeveloperMapperImpl();
    }
}
