package com.example.todo.rest;

import com.example.todo.dto.TaskDto;
import com.example.todo.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskResource {

    private final TaskService taskService;

    public TaskResource(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<TaskDto> findAll() {
        return taskService.findAll();
    }

    @GetMapping("/{id}")
    public TaskDto findById(@PathVariable Long id) {
        return taskService.findById(id);
    }

    @GetMapping("/title/{title}")
    public List<TaskDto> findAllByTitle(@PathVariable String title) {
        return taskService.findAllByTitle(title);
    }

    @PostMapping
    public TaskDto save(@RequestBody TaskDto taskDto) {
        return taskService.save(taskDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        taskService.deleteById(id);
    }
}
