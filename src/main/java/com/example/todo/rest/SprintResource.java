package com.example.todo.rest;

import com.example.todo.dto.SprintDto;
import com.example.todo.service.SprintService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sprints")
public class SprintResource {

    SprintService  sprintService;

    public SprintResource(SprintService sprintService) {
        this.sprintService = sprintService;
    }

    @GetMapping
    public List<SprintDto> findAll() {
        return sprintService.findAll();
    }

    @GetMapping("/name/{name}")
    public List<SprintDto> findAllByName(@PathVariable String name) {
        return sprintService.findAllByName(name);
    }

    @GetMapping("/{id}")
    public SprintDto findById(@PathVariable Long id) {
        return sprintService.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody SprintDto sprintDto) {
        sprintService.save(sprintDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        sprintService.deleteById(id);
    }
}
