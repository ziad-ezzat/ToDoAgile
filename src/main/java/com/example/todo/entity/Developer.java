package com.example.todo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "developers")
@Data
public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "developer_name")
    private String name;

    @ManyToMany(mappedBy = "assignedTo")
    private Set<Task> assignedTasks = new HashSet<>();

    @OneToMany(mappedBy = "owner")
    private Set<Task> ownedTasks = new HashSet<>();
}
