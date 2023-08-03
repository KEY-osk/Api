package kiosk.kioskApi.repository;

import kiosk.kioskApi.domain.Result;

import java.util.List;

public interface ResultRepository {
    List<Result> getAllResults();
}
