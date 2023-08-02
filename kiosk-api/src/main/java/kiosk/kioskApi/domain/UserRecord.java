package kiosk.kioskApi.domain;

public class UserRecord {
    private String enterprise_id;
    private PageData x;
    private PageData y;
    private PageDelayData delay_time;

    public String getEnterprise_id() {
        return enterprise_id;
    }

    public void setEnterprise_id(String enterprise_id) {
        this.enterprise_id = enterprise_id;
    }

    public PageData getX() {
        return x;
    }

    public void setX(PageData x) {
        this.x = x;
    }

    public PageData getY() {
        return y;
    }

    public void setY(PageData y) {
        this.y = y;
    }

    public PageDelayData getDelay_time() {
        return delay_time;
    }

    public void setDelay_time(PageDelayData delay_time) {
        this.delay_time = delay_time;
    }

}

