package ru.backend6itgirls.visitkrokhino.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TimetableDto {
    private int id;
    private int mainCategoryId;
    private LocalTime start;
    private Duration duration;
}
