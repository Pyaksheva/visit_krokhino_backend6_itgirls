package ru.backend6itgirls.visitkrokhino.service;

import ru.backend6itgirls.visitkrokhino.dto.ExtraCategoryDto;

import java.util.List;

public interface ExtraCategoryService {
    List<ExtraCategoryDto> getExtraCategoryByMainCategoryId(Long id);
}
