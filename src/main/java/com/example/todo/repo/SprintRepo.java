package com.example.todo.repo;

import com.example.todo.entity.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SprintRepo extends JpaRepository<Sprint, Long> {

    Optional<Sprint> findAllByName(String name);
}
