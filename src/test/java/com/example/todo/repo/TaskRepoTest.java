package com.example.todo.repo;

import com.example.todo.entity.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TaskRepoTest {

    @Autowired
    private TaskRepo taskRepo;

    @Test
    public void testFindAllByTitle() {
        List<Task> tasks = taskRepo.findAllByTitle("title");
        System.out.println(tasks);
    }
}
