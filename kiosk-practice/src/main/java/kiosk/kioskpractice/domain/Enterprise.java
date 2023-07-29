package kiosk.kioskApi.domain;

import java.util.List;

public class Enterprise {
    private String enterprise_id;
    private String category_id;
    private String name;
    private String url;

    public Enterprise(String enterprise_id, String category_id, String name, String url) {
        this.enterprise_id = enterprise_id;
        this.category_id = category_id;
        this.name = name;
        this.url = url;
    }

    public String getEnterprise_id() {
        return enterprise_id;
    }

    public void setEnterprise_id(String enterprise_id) {
        this.enterprise_id = enterprise_id;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}



