package kiosk.kioskApi.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ResultData {
    private List<Result> results;
    private String date;

    public ResultData() {
    }

    public List<Result> getResult() {
        return results;
    }

    public void setResult(List<Result> results) {
        this.results = results;
    }

    public String getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.date = date.format(formatter);
    }
}
