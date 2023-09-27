package com.example.todo.service;

import com.example.todo.dto.TaskDto;
import com.example.todo.entity.Task;
import com.example.todo.repo.TaskRepo;
import com.example.todo.service.mapper.taskMap.TaskMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {

    private final TaskRepo taskRepo;
    private final TaskMapper taskMapper;

    public TaskServiceImpl(TaskRepo taskRepo, TaskMapper taskMapper) {
        this.taskRepo = taskRepo;
        this.taskMapper = taskMapper;
    }

    @Override
    public List<TaskDto> findAll() {
        return taskRepo.findAll().stream().map(taskMapper::entityToDto).toList();
    }

    @Override
    public TaskDto findById(Long id) {
        return taskRepo.findById(id).map(taskMapper::entityToDto).orElse(null);
    }

    @Override
    public TaskDto save(TaskDto taskDto) {
        Task task = taskMapper.dtoToEntity(taskDto);
        task = taskRepo.save(task);
        return taskMapper.entityToDto(task);
    }

    @Override
    public void deleteById(Long id) {
        taskRepo.deleteById(id);
    }

    @Override
    public Optional<TaskDto> findAllByTitle(String title) {
        return taskRepo.findAllByTitle(title).map(taskMapper::entityToDto);
    }
}
