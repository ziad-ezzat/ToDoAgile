package com.example.todo.service;

import com.example.todo.dto.DeveloperDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DeveloperService {

    List<DeveloperDto> findAll();
    DeveloperDto findById(Long id);
    void save(DeveloperDto developerDto);
    void deleteById(Long id);
    Optional<DeveloperDto> findAllByName(String name);
}
