package com.example.todo.service;

import com.example.todo.dto.TaskDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {

    List<TaskDto> findAll();
    TaskDto findById(Long id);
    TaskDto save(TaskDto taskDto);
    void deleteById(Long id);
    List<TaskDto> findAllByTitle(String title);
}
