package kiosk.kioskApi.service;

import kiosk.kioskApi.domain.Enterprise;
import kiosk.kioskApi.domain.Result;
import kiosk.kioskApi.domain.ResultResponse;
import kiosk.kioskApi.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {
        private final ResultRepository resultRepository;

    @Autowired
    public ResultServiceImpl(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @Override
    public List<Result> getAllResults() {
        return resultRepository.getAllResults();
    }

}
