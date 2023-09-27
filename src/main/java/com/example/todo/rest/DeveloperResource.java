package com.example.todo.rest;

import com.example.todo.dto.DeveloperDto;
import com.example.todo.service.DeveloperService;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
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

    @GetMapping("/get")
    public List<DeveloperDto> findAllByNameOrId(@RequestParam(required = false) String name,@RequestParam(required = false) Long id) {
        if (id != null)
        {
            if (name != null)
            {
                if ( developerService.findById(id).getName().equals(name))
                {
                    return Collections.singletonList(developerService.findById(id));
                }
                else
                {
                    return Collections.emptyList();
                }
            }
            else
            {
                return Collections.singletonList(developerService.findById(id));
            }
        }
        else if (name != null) {
            return developerService.findAllByName(name).map(List::of).orElseThrow();
        }
        throw new IllegalArgumentException("You must specify either name or id");
    }

    @PostMapping("/save")
    public void save(@RequestBody DeveloperDto developerDto) {
        developerService.save(developerDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        developerService.deleteById(id);
    }
}
