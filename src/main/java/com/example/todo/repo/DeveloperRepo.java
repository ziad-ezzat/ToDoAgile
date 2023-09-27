package com.example.todo.repo;

import com.example.todo.dto.DeveloperDto;
import com.example.todo.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DeveloperRepo extends JpaRepository<Developer, Long> {

    Optional<Developer> findAllByName(String name);
}
