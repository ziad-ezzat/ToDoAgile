package com.example.todo.rest;

import com.example.todo.dto.TaskDto;
import com.example.todo.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
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

    @GetMapping("/get")
    public List<TaskDto> findAllByTitleOrId(@RequestParam(required = false) String title,@RequestParam(required = false) Long id) {
        if (id != null)
        {
            if (title != null)
            {
                if ( taskService.findById(id).getTitle().equals(title))
                {
                    return Collections.singletonList(taskService.findById(id));
                }
                else
                {
                    return Collections.emptyList();
                }
            }
            else
            {
                return Collections.singletonList(taskService.findById(id));
            }
        }
        else if (title != null) {
            return taskService.findAllByTitle(title).map(List::of).orElseThrow();
        }
        throw new IllegalArgumentException("You must specify either name or id");
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
