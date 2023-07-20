package kiosk.kioskpractice.service;

import kiosk.kioskpractice.domain.Enterprise;
import java.util.List;

public interface EnterpriseService {
    List<Enterprise> getAllEnterprises();
}

/*
package kiosk.kioskpractice.service;


import kiosk.kioskpractice.domain.Enterprise;

import java.util.List;
import java.util.Optional;

public class EnterpriseService {

    private final EnterpriseRepository enterpriseRepository;
    public EnterpriseService(EnterpriseRepository enterpriseRepository) {
        this.enterpriseRepository = enterpriseRepository;
    }



    public List<Enterprise> findEnterprises() {
        return enterpriseRepository.findAll();
    }

    public Optional<Enterprise> findOne(String enterpriseId) {
        return enterpriseRepository.findByEnterpriseId(memberEnterpriseId);
    }
}
 */
