package kiosk.kioskApi.repository;

import kiosk.kioskApi.domain.Category;
import kiosk.kioskApi.domain.Enterprise;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryCategoryRepository implements CategoryRepository {
    private List<Category> categories;

    public MemoryCategoryRepository() {
        this.categories = new ArrayList<>();
        // 가상의 데이터베이스에서 데이터 추가
        categories.add(new Category("1", "카페"));
        categories.add(new Category("2", "식당"));
    }

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }
}

