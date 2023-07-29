package kiosk.kioskApi.domain;

import java.util.List;

public class CategoryData {
    private List<Category> categories;

    public CategoryData() {
    }

    public List<Category> getCategory() {
        return categories;
    }

    public void setCategory(List<Category> categories) {
        this.categories = categories;
    }

}
