package kiosk.kioskApi.service;

import kiosk.kioskApi.domain.Category;
import kiosk.kioskApi.domain.Enterprise;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
}
