package com.example.todo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sprints")
@Data
public class Sprint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "sprint_name")
    private String name;

    @OneToMany(mappedBy = "sprint")
    private Set<Task> tasks = new HashSet<>();
}

