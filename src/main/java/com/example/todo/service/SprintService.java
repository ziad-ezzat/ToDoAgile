package com.example.todo.service;

import com.example.todo.dto.SprintDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SprintService {

    List<SprintDto> findAll();
    SprintDto findById(Long id);
    SprintDto save(SprintDto sprintDto);
    void deleteById(Long id);
    List<SprintDto> findAllByName(String name);
}
