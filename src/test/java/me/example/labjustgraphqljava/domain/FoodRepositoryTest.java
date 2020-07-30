package me.example.labjustgraphqljava.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FoodRepositoryTest {
    @Autowired FoodRepository repository;

    @Test
//    @Commit
    @Disabled
    void saveFoodTest() {
        repository.save(Food.builder().name("닭고기").build());
    }

}