package ru.backend6itgirls.visitkrokhino.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.backend6itgirls.visitkrokhino.dto.ExtraCategoryDto;
import ru.backend6itgirls.visitkrokhino.model.entity.ExtraCategory;
import ru.backend6itgirls.visitkrokhino.repository.ExtraCategoryRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ExtraCategoryServiceImpl implements ExtraCategoryService {

    private final ExtraCategoryRepository extraCategoryRepository;

    @Override
    public List<ExtraCategoryDto> getExtraCategoryByMainCategoryId(Long id) {
        List<ExtraCategory> extraCategories = extraCategoryRepository.findByMainCategoryList_Id(id);
        return extraCategories.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private ExtraCategoryDto convertToDto(ExtraCategory extraCategory) {
        return ExtraCategoryDto.builder()
                .id(extraCategory.getId())
                .name(extraCategory.getName())
                .price(extraCategory.getPrice())
                .build();
    }
}
