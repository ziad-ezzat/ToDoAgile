package com.example.todo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String status;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Developer owner;

    @ManyToMany
    @JoinTable(name = "task_developer",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "developer_id"))
    private List<Developer> assignedTo = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "sprint_id")
    private Sprint sprint;
}

