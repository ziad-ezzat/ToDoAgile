package com.example.todo.repo;

import com.example.todo.entity.Sprint;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class SprintRepoTest {

    @Autowired
    private SprintRepo sprintRepo;

    @Test
    public void testFindAllByName() {
        Sprint sprint = new Sprint();
        sprint.setName("sprint");
        sprintRepo.save(sprint);

        List<Sprint> sprints = sprintRepo.findAllByName("sprint");

        assert sprints.size() == 1;
    }
}
