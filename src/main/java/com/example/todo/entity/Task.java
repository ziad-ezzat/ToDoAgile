package com.example.todo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tasks")
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "task_title")
    private String title;

    @Column(name = "task_description")
    private String description;

    @Column(name = "task_status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Developer owner;

    @ManyToMany
    @JoinTable(name = "task_developer",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "developer_id"))
    private Set<Developer> assignedTo = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "sprint_id")
    private Sprint sprint;
}

