package kiosk.kioskApi.controller;

import kiosk.kioskApi.domain.Enterprise;
import kiosk.kioskApi.domain.EnterpriseData;
import kiosk.kioskApi.domain.EnterpriseResponse;
import kiosk.kioskApi.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/enterprise/category")

public class EnterpriseController {

    private final EnterpriseService enterpriseService;

    @Autowired // 필드 자동주입
    public EnterpriseController(EnterpriseService enterpriseService) {
        this.enterpriseService = enterpriseService;
    }

    @GetMapping
    public EnterpriseResponse getEnterpriseByCategory() {
        List<Enterprise> enterprises = enterpriseService.getAllEnterprises();
        // 데이터베이스나 다른 소스에서 데이터를 조회

        EnterpriseResponse response = new EnterpriseResponse();
        response.setCode(200);
        response.setMessage("카테고리 별 프랜차이즈 조회");

        EnterpriseData enterpriseData = new EnterpriseData();
        enterpriseData.setEnterprise(enterprises);
        response.setData(enterpriseData);

        return response;
    }

}
