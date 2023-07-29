package kiosk.kioskApi.service;

import kiosk.kioskApi.domain.Category;
import kiosk.kioskApi.domain.Enterprise;
import kiosk.kioskApi.repository.CategoryRepository;
import kiosk.kioskApi.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.getAllCategories();
    }
}
