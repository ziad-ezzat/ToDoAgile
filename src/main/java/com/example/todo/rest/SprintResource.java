package com.example.todo.rest;

import com.example.todo.dto.SprintDto;
import com.example.todo.service.SprintService;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
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

    @GetMapping("/get")
    public List<SprintDto> findAllByNameOrId(@RequestParam(required = false) String name,@RequestParam(required = false) Long id) {
        if (id != null)
        {
            if (name != null)
            {
                if ( sprintService.findById(id).getName().equals(name))
                {
                    return Collections.singletonList(sprintService.findById(id));
                }
                else
                {
                    return Collections.emptyList();
                }
            }
            else
            {
                return Collections.singletonList(sprintService.findById(id));
            }
        }
        else if (name != null) {
            return sprintService.findAllByName(name).map(List::of).orElseThrow();
        }
        throw new IllegalArgumentException("You must specify either name or id");
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
