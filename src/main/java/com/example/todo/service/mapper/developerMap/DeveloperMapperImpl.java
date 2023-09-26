package com.example.todo.service.mapper.developerMap;

import com.example.todo.dto.DeveloperDto;
import com.example.todo.entity.Developer;

public class DeveloperMapperImpl implements DeveloperMapper{
    @Override
    public Developer dtoToEntity(DeveloperDto developerDto) {

        Developer developer = new Developer();

        developer.setId(developerDto.getId());
        developer.setName(developerDto.getName());
        developer.setAssignedTasks( developerDto.getAssignedTaskIds() );
        developer.setOwnedTasks( developerDto.getOwnedTaskIds());

        return developer;
    }

    @Override
    public DeveloperDto entityToDto(Developer developer) {

        DeveloperDto developerDto = new DeveloperDto();

        developerDto.setId(developer.getId());
        developerDto.setName(developer.getName());
        developerDto.setAssignedTaskIds( developer.getAssignedTasks() );
        developerDto.setOwnedTaskIds( developer.getOwnedTasks() );

        return developerDto;
    }
}
