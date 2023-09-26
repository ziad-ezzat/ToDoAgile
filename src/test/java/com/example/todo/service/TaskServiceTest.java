package com.example.todo.service;

import com.example.todo.dto.TaskDto;
import com.example.todo.entity.Task;
import com.example.todo.repo.TaskRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class TaskServiceTest {

    @Mock
    private TaskRepo taskRepo;

    @InjectMocks
    private TaskService taskService;

    @BeforeEach
    public void setUp() {
        Task task = new Task();
        task.setId(1L);
        task.setTitle("title");
        task.setDescription("description");
        when(taskRepo.save(any(Task.class))).thenReturn(task);
    }

    @Test
    public void testCreateTask() {
        TaskDto task = new TaskDto();
        task.setTitle("title");
        task.setDescription("description");
        TaskDto createdTask = taskService.save(task);
        assertThat(createdTask.getId()).isNotNull();
        assertThat(createdTask.getTitle()).isEqualTo(task.getTitle());
        assertThat(createdTask.getDescription()).isEqualTo(task.getDescription());
    }
}
