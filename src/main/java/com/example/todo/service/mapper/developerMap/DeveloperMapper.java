package com.example.todo.service.mapper.developerMap;

import com.example.todo.dto.DeveloperDto;
import com.example.todo.entity.Developer;

public interface DeveloperMapper {

    Developer dtoToEntity(DeveloperDto developerDto);
    DeveloperDto entityToDto(Developer developer);
}
