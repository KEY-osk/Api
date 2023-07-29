package kiosk.kioskApi.controller;

import kiosk.kioskApi.domain.*;
import kiosk.kioskApi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public CategoryResponse getCategory() {
        List<Category> categories = categoryService.getAllCategories();

        CategoryResponse response = new CategoryResponse();
        response.setCode(200);
        response.setMessage("이미지 조회");

        CategoryData categoryData = new CategoryData();
        categoryData.setCategory(categories);
        response.setData(categoryData);

        return response;
    }

}
