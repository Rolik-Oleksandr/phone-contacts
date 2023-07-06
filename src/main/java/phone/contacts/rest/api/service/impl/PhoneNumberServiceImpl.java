package phone.contacts.rest.api.service.impl;

import org.springframework.stereotype.Service;
import phone.contacts.rest.api.dao.PhoneNumberDao;
import phone.contacts.rest.api.model.PhoneNumber;
import phone.contacts.rest.api.service.PhoneNumberService;

@Service
public class PhoneNumberServiceImpl implements PhoneNumberService {
    private final PhoneNumberDao phoneNumberDao;

    public PhoneNumberServiceImpl(PhoneNumberDao phoneNumberDao) {
        this.phoneNumberDao = phoneNumberDao;
    }

    @Override
    public PhoneNumber add(PhoneNumber phoneNumber) {
        return phoneNumberDao.add(phoneNumber);
    }

    @Override
    public PhoneNumber get(Long id) {
        return phoneNumberDao.get(id).orElseThrow(
                        () -> new RuntimeException("Couldn't get phone number with id: " + id));
    }
}
