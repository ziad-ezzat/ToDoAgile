package com.example.todo.service;

import com.example.todo.dto.TaskDto;
import com.example.todo.entity.Task;
import com.example.todo.repo.TaskRepo;
import com.example.todo.service.mapper.taskMap.TaskMapper;
import com.example.todo.service.mapper.taskMap.TaskMapperImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.mapstruct.Mapper;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class TaskServiceTest {

    @Mock
    private TaskRepo taskRepo;

    @Mock
    private TaskMapper taskMapper;

    @InjectMocks
    private TaskService taskService;

    @BeforeEach
    public void setUp() {
        when(taskMapper.dtoToEntity(any(TaskDto.class))).thenReturn(new Task());
        when(taskMapper.entityToDto(any(Task.class))).thenReturn(new TaskDto());
    }

    @Test
    public void testCreateTask() {
        TaskDto taskDto = new TaskDto();
        taskDto.setTitle("title");
        taskDto.setDescription("description");
        TaskDto createdTaskDto = taskService.save(taskDto);
        assertThat(createdTaskDto).isNotNull();
    }
}
