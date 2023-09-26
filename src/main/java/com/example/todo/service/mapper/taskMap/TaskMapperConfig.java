package com.example.todo.service.mapper.taskMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskMapperConfig {

    @Bean
    public TaskMapper taskMapper() {
        return new TaskMapperImpl();
    }
}
