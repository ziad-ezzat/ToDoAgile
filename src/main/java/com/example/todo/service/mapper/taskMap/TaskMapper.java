package com.example.todo.service.mapper.taskMap;

import com.example.todo.dto.TaskDto;
import com.example.todo.entity.Task;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    Task dtoToEntity(TaskDto taskDto);
    TaskDto entityToDto(Task task);
}
