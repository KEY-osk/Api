package kiosk.kioskApi.service;

import kiosk.kioskApi.domain.UserRecord;

public interface UserRecordService {
    UserRecord createUserRecord(UserRecord userRecord);
    UserRecord getUserRecordByEnterpriseId(String enterpriseId);
}

