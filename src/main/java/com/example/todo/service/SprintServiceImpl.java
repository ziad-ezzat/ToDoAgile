package com.example.todo.service;

import com.example.todo.dto.SprintDto;
import com.example.todo.entity.Sprint;
import com.example.todo.repo.SprintRepo;
import com.example.todo.service.mapper.sprintMap.SprintMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SprintServiceImpl implements SprintService{

    private final SprintRepo sprintRepo;
    private final SprintMapper sprintMapper;

    public SprintServiceImpl(SprintRepo sprintRepo, SprintMapper sprintMapper) {
        this.sprintRepo = sprintRepo;
        this.sprintMapper = sprintMapper;
    }

    @Override
    public List<SprintDto> findAll() {
        return sprintRepo.findAll().stream().map(sprintMapper::entityToDto).toList();
    }

    @Override
    public SprintDto findById(Long id) {
        return sprintRepo.findById(id).map(sprintMapper::entityToDto).orElse(null);
    }

    @Override
    public SprintDto save(SprintDto sprintDto) {
        Sprint sprint = sprintMapper.dtoToEntity(sprintDto);
        sprint = sprintRepo.save(sprint);
        return sprintMapper.entityToDto(sprint);
    }

    @Override
    public void deleteById(Long id) {
        sprintRepo.deleteById(id);
    }

    @Override
    public List<SprintDto> findAllByName(String name) {
        return sprintRepo.findAllByName(name).stream().map(sprintMapper::entityToDto).toList();
    }
}
