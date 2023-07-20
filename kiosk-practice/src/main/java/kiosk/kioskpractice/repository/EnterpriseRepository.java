package kiosk.kioskpractice.repository;

import kiosk.kioskpractice.domain.Enterprise;
import java.util.List;

public interface EnterpriseRepository {
    List<Enterprise> getAllEnterprises();
}

/*
import kiosk.kioskpractice.domain.Enterprise;


import java.util.List;
import java.util.Optional;

public interface EnterpriseRepository {
    Enterprise save(Enterprise enterprise);
    Optional<Enterprise> findByEnterpriseId(String enterpriseId) ;
    Optional<Enterprise> findByName(String name);
    Optional<Enterprise> findByUrl(String url);
    List<Enterprise> findAll();
}

 */