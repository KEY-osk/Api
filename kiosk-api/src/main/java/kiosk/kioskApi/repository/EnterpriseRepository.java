package kiosk.kioskApi.repository;

import kiosk.kioskApi.domain.Enterprise;
import java.util.List;

public interface EnterpriseRepository {
    List<Enterprise> getAllEnterprises();
}