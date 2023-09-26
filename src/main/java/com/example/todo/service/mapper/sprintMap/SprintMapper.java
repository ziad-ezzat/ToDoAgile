package com.example.todo.service.mapper.sprintMap;

import com.example.todo.dto.SprintDto;
import com.example.todo.entity.Sprint;

public interface SprintMapper {

    Sprint dtoToEntity(SprintDto sprintDto);
    SprintDto entityToDto(Sprint sprint);
}
