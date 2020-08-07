package command.domain;

import command.dto.SearchInput;

import java.util.List;

public interface CustomFoodRepository {
    List<Food> searchFood(SearchInput input);
}
