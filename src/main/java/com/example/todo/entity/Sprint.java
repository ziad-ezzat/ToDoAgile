package com.example.todo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Sprint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}

