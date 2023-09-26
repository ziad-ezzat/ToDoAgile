package com.example.todo.service.mapper.sprintMap;

import com.example.todo.dto.SprintDto;
import com.example.todo.entity.Sprint;

public class SprintMapperImpl implements SprintMapper {
    @Override
    public Sprint dtoToEntity(SprintDto sprintDto) {

        Sprint sprint = new Sprint();
        sprint.setId(sprintDto.getId());
        sprint.setName(sprintDto.getName());
        sprint.setTasks( sprintDto.getTaskIds() );

        return sprint;
    }

    @Override
    public SprintDto entityToDto(Sprint sprint) {

        SprintDto sprintDto = new SprintDto();
        sprintDto.setId(sprint.getId());
        sprintDto.setName(sprint.getName());
        sprintDto.setTaskIds( sprint.getTasks() );

        return sprintDto;
    }
}
