package ru.backend6itgirls.visitkrokhino.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BookingCreateDto {
    @Size(min = 2, max = 20)
    @NotBlank(message = "Необходимо указать имя")
    private String customerName;
    @Size(min = 2, max = 40)
    @NotBlank(message = "Необходимо указать фамилию")
    private String customerSurname;
    @NotBlank(message = "Необходимо указать e-mail")
    private String customerEmail;
    @Size(min = 12, max = 12)
    @NotBlank(message = "Необходимо указать номер телефона")
    private String customerPhone;
    @NotNull(message = "Необходимо указать id основной услуги")
    private Integer mainCategoryId;
    //мб стоит указать ограничение
    @NotNull(message = "Необходимо указать количество гостей")
    private Integer guestsNumber;
    @NotNull(message = "Необходимо указать дату и время начала услуги")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime startDateTime;
    @NotNull(message = "Необходимо указать дату и время окончания услуги")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime endDateTime;
    private List<Integer> extraCategoryIds;
}
