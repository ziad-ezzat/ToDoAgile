package com.example.todo.dto;

import com.example.todo.entity.Task;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class SprintDto {

    private Long id;
    private String name;
    private Set<Task> taskIds;
}

