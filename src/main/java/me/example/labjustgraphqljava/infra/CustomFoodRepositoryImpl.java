package me.example.labjustgraphqljava.infra;

import lombok.RequiredArgsConstructor;
import me.example.labjustgraphqljava.domain.CustomFoodRepository;
import me.example.labjustgraphqljava.domain.Food;
import me.example.labjustgraphqljava.dto.SearchInput;
import me.example.labjustgraphqljava.generated.public_.Tables;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;

import java.util.List;

import static me.example.labjustgraphqljava.generated.public_.Tables.FOOD;

@RequiredArgsConstructor
@Repository
public class CustomFoodRepositoryImpl implements CustomFoodRepository {

    private final DSLContext dslContext;

    @Override public List<Food> searchFood(SearchInput input) {
        return this.dslContext
                .select()
                .from(FOOD)
                .where(condition(input))
                .fetchInto(Food.class);
    }

    private Condition condition(SearchInput input) {
        Condition condition = DSL.trueCondition();
        if (input.getCarbs() != null) {
            condition = condition.and(FOOD.CARBS.eq(input.getCarbs()));
        }
        if (input.getFat() != null) {
            condition = condition.and(FOOD.FAT.eq(input.getFat()));
        }
        return condition;
    }
}
