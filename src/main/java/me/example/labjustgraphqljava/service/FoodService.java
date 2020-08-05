package me.example.labjustgraphqljava.service;

import lombok.RequiredArgsConstructor;
import me.example.labjustgraphqljava.domain.CustomFoodRepository;
import me.example.labjustgraphqljava.domain.Food;
import me.example.labjustgraphqljava.dto.SearchInput;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodService {
    private final CustomFoodRepository repository;

    @Transactional
    public void getFood() {
        List<Food> foods = repository.searchFood(new SearchInput());
        System.out.println(foods.get(0));
    }

}
