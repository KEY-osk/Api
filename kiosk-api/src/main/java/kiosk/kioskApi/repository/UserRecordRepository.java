package kiosk.kioskApi.repository;

        import kiosk.kioskApi.domain.UserRecord;

public interface UserRecordRepository {
    UserRecord save(UserRecord userRecord);
    UserRecord findByEnterpriseId(String enterpriseId);
}

