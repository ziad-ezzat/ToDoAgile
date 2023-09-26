package com.example.todo.service.mapper.taskMap;

import com.example.todo.dto.TaskDto;
import com.example.todo.entity.Task;

public class TaskMapperImpl implements TaskMapper {
    @Override
    public Task dtoToEntity(TaskDto taskDto) {

        Task task = new Task();
        task.setId(taskDto.getId());
        task.setOwner( taskDto.getOwnerId() );
        task.setSprint( taskDto.getSprintId() );
        task.setStatus( taskDto.getStatus() );
        task.setTitle( taskDto.getTitle() );
        task.setDescription( taskDto.getDescription() );
        task.setAssignedTo( taskDto.getAssignedToIds() );

        return task;
    }

    @Override
    public TaskDto entityToDto(Task task) {

        TaskDto taskDto = new TaskDto();
        taskDto.setId(task.getId());
        taskDto.setOwnerId( task.getOwner() );
        taskDto.setSprintId( task.getSprint() );
        taskDto.setStatus( task.getStatus() );
        taskDto.setTitle( task.getTitle() );
        taskDto.setDescription( task.getDescription() );
        taskDto.setAssignedToIds( task.getAssignedTo() );

        return taskDto;
    }
}
