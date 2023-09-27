package com.example.todo.service.mapper.developerMap;

import com.example.todo.dto.DeveloperDto;
import com.example.todo.entity.Developer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DeveloperMapper {

    Developer dtoToEntity(DeveloperDto developerDto);
    DeveloperDto entityToDto(Developer developer);
}
