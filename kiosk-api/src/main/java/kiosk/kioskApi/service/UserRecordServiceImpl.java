package kiosk.kioskApi.service;

import kiosk.kioskApi.domain.UserRecord;
import kiosk.kioskApi.repository.UserRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRecordServiceImpl implements UserRecordService {

    private final UserRecordRepository userRecordRepository;

    @Autowired
    public UserRecordServiceImpl(UserRecordRepository userRecordRepository) {
        this.userRecordRepository = userRecordRepository;
    }

    @Override
    public UserRecord createUserRecord(UserRecord userRecord) {
        return userRecordRepository.save(userRecord);
    }

    @Override
    public UserRecord getUserRecordByEnterpriseId(String enterpriseId) {
        return userRecordRepository.findByEnterpriseId(enterpriseId);
    }
}

