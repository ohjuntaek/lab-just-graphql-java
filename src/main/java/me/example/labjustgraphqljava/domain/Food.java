package me.example.labjustgraphqljava.domain;

import lombok.Builder;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Builder
@ToString
public class Food {
    @Id
    private final Long no;
    private final String sampleId;
    private final String name; // 식품명
    private final String maker; // 제조사
    private final String checkYear; // 조사년도
    private final String foodType; // 식품분류
    private final String foodGroup; // 식품군
    private final String foodCode; // 식품코드
    private final String ref; // 출처
    private final String servingSize; // 1회 제공량
    private final String kcalEnergy; // 에너지(kcal)
    private final String kjEnergy; // 에너지(kj)
    private final double protein; // 단백질(g)
    private final double fat; // 당류(g)
    private final double carbs; // 탄수화물(g)
    private final double totalSugar; // 총당류(g)
    private final int sodium; // 나트륨(g)
    private final double cholesterol; // 콜레스테롤(mg)
    private final double totalSaturatedFat; // 총포화지방산(g) (saturated fatty acid)
    private final int percentTotalSaturatedFat; // 총포화지방산(%)
    private final double transFat; // 트랜스지방산(g)

}
