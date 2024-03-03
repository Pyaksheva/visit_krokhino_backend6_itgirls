package ru.backend6itgirls.visitkrokhino.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.backend6itgirls.visitkrokhino.dto.MainCategoryDto;
import ru.backend6itgirls.visitkrokhino.model.entity.MainCategory;
import ru.backend6itgirls.visitkrokhino.repository.MainCategoryRepository;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MainCategoryServiceImpl implements MainCategoryService {
    private final MainCategoryRepository mainCategoryRepository;

    @Override
    public MainCategoryDto getMainCategoryById(Long id) {
        Optional<MainCategory> mainCategory = mainCategoryRepository.findById(id);
        MainCategoryDto mainCategoryDto;
        if (mainCategory.isPresent()) {
            mainCategoryDto = convertEntityToDto(mainCategory.get());
            return mainCategoryDto;
        } else {
            throw new NoSuchElementException("No value present");
        }
    }

    private MainCategoryDto convertEntityToDto(MainCategory mainCategory) {
        MainCategoryDto mainCategoryDto = MainCategoryDto.builder()
                .id(mainCategory.getId())
                .name(mainCategory.getName())
                .price(mainCategory.getPrice())
                .build();
        return mainCategoryDto;
    }
}


