package ru.backend6itgirls.visitkrokhino.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ExtraCategoryDto {
    private Long id;
    private String name;
    private int price;
}
