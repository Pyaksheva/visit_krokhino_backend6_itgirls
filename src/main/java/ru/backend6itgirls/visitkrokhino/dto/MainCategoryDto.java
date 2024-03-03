package ru.backend6itgirls.visitkrokhino.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MainCategoryDto {
    private Long id;
    private String name;
    private int price;
}
