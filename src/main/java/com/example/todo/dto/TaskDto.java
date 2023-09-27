package com.example.todo.dto;

import com.example.todo.entity.Developer;
import com.example.todo.entity.Sprint;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class TaskDto {

    private Long id;
    private String title;
    private String description;
    private String status;
    private Developer owner;
    private List<Developer> assignedTo;
    private Sprint sprint;
}

