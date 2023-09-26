package com.example.todo.dto;

import com.example.todo.entity.Developer;
import com.example.todo.entity.Sprint;
import lombok.Data;

import java.util.Set;

@Data
public class TaskDto {

    private Long id;
    private String title;
    private String description;
    private String status;
    private Developer ownerId;
    private Set<Developer> assignedToIds;
    private Sprint sprintId;
}

