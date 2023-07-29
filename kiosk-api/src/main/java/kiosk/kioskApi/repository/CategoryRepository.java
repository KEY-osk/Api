package kiosk.kioskApi.repository;

import kiosk.kioskApi.domain.Category;
import java.util.List;

public interface CategoryRepository {
    List<Category> getAllCategories();
}