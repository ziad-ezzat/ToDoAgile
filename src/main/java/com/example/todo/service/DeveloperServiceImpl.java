package com.example.todo.service;

import com.example.todo.dto.DeveloperDto;
import com.example.todo.entity.Developer;
import com.example.todo.repo.DeveloperRepo;
import com.example.todo.service.mapper.developerMap.DeveloperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DeveloperServiceImpl implements DeveloperService {

    private final DeveloperRepo developerRepo;
    private final DeveloperMapper developerMapper;

    @Autowired
    public DeveloperServiceImpl(DeveloperRepo developerRepo, DeveloperMapper developerMapper) {
        this.developerRepo = developerRepo;
        this.developerMapper = developerMapper;
    }

    @Override
    public List<DeveloperDto> findAll() {
        return developerRepo.findAll().stream().map(developerMapper::entityToDto).toList();
    }

    @Override
    public DeveloperDto findById(Long id) {
        return developerRepo.findById(id).map(developerMapper::entityToDto).orElse(null);
    }

    @Override
    public void save(DeveloperDto developerDto) {
        Developer developer = developerMapper.dtoToEntity(developerDto);
        developer = developerRepo.save(developer);
        developerMapper.entityToDto(developer);
    }

    @Override
    public void deleteById(Long id) {
        developerRepo.deleteById(id);
    }

    @Override
    public Optional<DeveloperDto> findAllByName(String name) {
        return developerRepo.findAllByName(name).map(developerMapper::entityToDto);
    }
}
