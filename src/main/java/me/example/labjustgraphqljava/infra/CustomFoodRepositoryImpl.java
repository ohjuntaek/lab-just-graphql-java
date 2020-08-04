package me.example.labjustgraphqljava.infra;

import lombok.RequiredArgsConstructor;
import me.example.labjustgraphqljava.domain.CustomFoodRepository;
import me.example.labjustgraphqljava.domain.Food;
import me.example.labjustgraphqljava.dto.SearchInput;
import me.example.labjustgraphqljava.generated.public_.Tables;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class CustomFoodRepositoryImpl implements CustomFoodRepository {

    private final DSLContext dslContext;

    @Override public List<Food> searchFood(SearchInput input) {
        return this.dslContext.select().from(Tables.FOOD).fetchInto(Food.class);
    }

}
