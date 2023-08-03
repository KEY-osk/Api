package kiosk.kioskApi.repository;

import kiosk.kioskApi.domain.Result;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryResultRepository implements ResultRepository {
    private List<Result> results;
    private LocalDateTime date;

    public MemoryResultRepository() {
        this.results = new ArrayList<>();
        this.date = LocalDateTime.now();
    }

    @Override
    public List<Result> getAllResults() {
        return results;
    }

    public void save(Result result) {
        results.add(result);
    }

    public String getDateFormatted() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return date.format(formatter);
    }

}
