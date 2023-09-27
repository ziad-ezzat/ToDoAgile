package com.example.todo.service;

import com.example.todo.dto.SprintDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SprintService {

    List<SprintDto> findAll();
    SprintDto findById(Long id);
    SprintDto save(SprintDto sprintDto);
    void deleteById(Long id);
    Optional<SprintDto> findAllByName(String name);
}
