package com.example.todo.repo;

import com.example.todo.dto.TaskDto;
import com.example.todo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface TaskRepo extends JpaRepository<Task, Long> {

   List<Task> findAllByTitle(String title);
}
