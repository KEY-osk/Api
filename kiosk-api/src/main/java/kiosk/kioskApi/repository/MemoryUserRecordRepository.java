package kiosk.kioskApi.repository;

import kiosk.kioskApi.domain.UserRecord;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class MemoryUserRecordRepository implements UserRecordRepository {

    private final Map<String, UserRecord> userRecords = new HashMap<>();

    @Override
    public UserRecord save(UserRecord userRecord) {
        userRecords.put(userRecord.getEnterprise_id(), userRecord);
        return userRecord;
    }

    @Override
    public UserRecord findByEnterpriseId(String enterpriseId) {
        return userRecords.get(enterpriseId);
    }
}

