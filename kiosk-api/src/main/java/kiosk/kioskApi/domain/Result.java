package kiosk.kioskApi.domain;

import java.time.LocalDateTime;

public class Result {
    private String result_id;
    private String date;
    private CountItem[] items;

    public String getResult_id() {
        return result_id;
    }

    public void setResult_id(String result_id) {
        this.result_id = result_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public CountItem[] getItems() {
        return items;
    }

    public void setItems(CountItem[] items) {
        this.items = items;
    }

    // count 배열
    public static class CountItem {
        private String ranking;
        private String enterprise_id;
        private String category_id;
        private String name;
        private String image_url;

        public String getRanking() {
            return ranking;
        }

        public void setRanking(String ranking) {
            this.ranking = ranking;
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

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }
    }
}
