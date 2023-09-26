package com.example.todo.service.mapper.sprintMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SprintMapperConfig {

    @Bean
    public SprintMapper sprintMapper() {
        return new SprintMapperImpl();
    }
}
