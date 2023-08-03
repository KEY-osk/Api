package kiosk.kioskApi.controller;

import kiosk.kioskApi.domain.Result;
import kiosk.kioskApi.domain.ResultData;
import kiosk.kioskApi.domain.ResultResponse;
import kiosk.kioskApi.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/result")

public class ResultController {
    private final ResultService resultService;

    @Autowired
    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @GetMapping
    public ResultResponse getResultByCategory() {
        List<Result> results = resultService.getAllResults();

        ResultResponse response = new ResultResponse();
        response.setCode(200);
        response.setMessage("데이터 분석 결과 조회");

        ResultData resultData = new ResultData();
        resultData.setResult(results);
        response.setData(resultData);

        // 현재 날짜
        LocalDateTime date = LocalDateTime.now();
        response.getData().setDate(date);

        return response;
    }

}
