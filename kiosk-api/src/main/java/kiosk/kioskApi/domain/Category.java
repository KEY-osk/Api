package kiosk.kioskApi.domain;

public class Category {

    private String category_id;
    private String name;

    public Category(String category_id, String name) {
        this.category_id = category_id;
        this.name = name;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
