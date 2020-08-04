package me.example.labjustgraphqljava.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FoodServiceTest {

    @Autowired private FoodService service;

    @Test
    void test() {
        service.getFood();
    }

}