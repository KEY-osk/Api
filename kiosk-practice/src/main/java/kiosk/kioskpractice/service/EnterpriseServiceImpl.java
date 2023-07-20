package kiosk.kioskpractice.service;

import kiosk.kioskpractice.domain.Enterprise;
import kiosk.kioskpractice.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {
    private final EnterpriseRepository enterpriseRepository;

    @Autowired
    public EnterpriseServiceImpl(EnterpriseRepository enterpriseRepository) {
        this.enterpriseRepository = enterpriseRepository;
    }

    @Override
    public List<Enterprise> getAllEnterprises() {
        return enterpriseRepository.getAllEnterprises();
    }
}

