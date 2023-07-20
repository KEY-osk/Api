package kiosk.kioskpractice.controller;

import kiosk.kioskpractice.domain.Enterprise;
import kiosk.kioskpractice.domain.EnterpriseData;
import kiosk.kioskpractice.domain.EnterpriseResponse;
import kiosk.kioskpractice.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/enterprise")

public class EnterpriseController {

    private final EnterpriseService enterpriseService;

    @Autowired
    public EnterpriseController(EnterpriseService enterpriseService) {
        this.enterpriseService = enterpriseService;
    }

    @GetMapping("/category")
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


/*
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping(value = "/api/enterprise/category/{category id}")
public class EnterpriseController {

    @RequestMapping(value = "/list/{category id}", method= RequestMethod.GET)

    @ResponseBody() // JSON
    public Map<String, String> home(@PathVariable String enterpriseId, String name, String url) {

        Map<String, String> list = new HashMap<>();

        list.put("enterprise_id", enterpriseId);
        list.put("category_id", "cafe");
        list.put("name", name);
        list.put("url", url);

        return list;
    }
}
*/
