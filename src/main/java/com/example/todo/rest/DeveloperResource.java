package com.example.todo.rest;

import com.example.todo.dto.DeveloperDto;
import com.example.todo.service.DeveloperService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/developers")
public class DeveloperResource {

    DeveloperService developerService;

    public DeveloperResource(DeveloperService developerService) {
        this.developerService = developerService;
    }

    @GetMapping
    public List<DeveloperDto> findAll() {
        return developerService.findAll();
    }

    @GetMapping("/name/{name}")
    public List<DeveloperDto> findAllByName(@PathVariable String name) {
        return developerService.findAllByName(name);
    }

    @GetMapping("/{id}")
    public DeveloperDto findById(@PathVariable Long id) {
        return developerService.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody DeveloperDto developerDto) {
        developerService.save(developerDto);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        developerService.deleteById(id);
    }
}
