package ru.backend6itgirls.visitkrokhino.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.backend6itgirls.visitkrokhino.dto.ExtraCategoryDto;
import ru.backend6itgirls.visitkrokhino.service.ExtraCategoryService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ExtraCategoryRestController {
    private final ExtraCategoryService extraCategoryService;

    @GetMapping("/extracategory/maincategory/{id}/")
    List<ExtraCategoryDto> getExtraCategoryByMainCategoryId(@PathVariable("id") Long id) {
        return extraCategoryService.getExtraCategoryByMainCategoryId(id);
    }

}
