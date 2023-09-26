package com.example.todo.repo;

import com.example.todo.entity.Developer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DeveloperRepoTest {

    @Autowired
    private DeveloperRepo developerRepo;

    @Test
    public void testFindAllByName() {
        Developer developer = new Developer();
        developer.setName("developer");
        developerRepo.save(developer);

        assert developerRepo.findAllByName("developer").size() == 1;
    }
}
