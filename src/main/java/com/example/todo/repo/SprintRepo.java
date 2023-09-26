package com.example.todo.repo;

import com.example.todo.dto.SprintDto;
import com.example.todo.entity.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SprintRepo extends JpaRepository<Sprint, Long> {

    List<Sprint> findAllByName(String name);
}
