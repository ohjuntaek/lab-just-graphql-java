package me.example.labjustgraphqljava.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SearchInput {
    Double carbs = 0.0;
    Double fat = null;
}
