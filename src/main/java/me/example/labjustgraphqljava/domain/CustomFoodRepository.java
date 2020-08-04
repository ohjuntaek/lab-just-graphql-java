package me.example.labjustgraphqljava.domain;

import me.example.labjustgraphqljava.dto.SearchInput;

import java.util.List;

public interface CustomFoodRepository {
    List<Food> searchFood(SearchInput input);
}
