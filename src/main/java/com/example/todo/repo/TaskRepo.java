package com.example.todo.repo;

import com.example.todo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepo extends JpaRepository<Task, Long> {

   Optional<Task> findAllByTitle(String title);
}
