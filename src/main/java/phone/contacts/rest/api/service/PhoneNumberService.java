package phone.contacts.rest.api.service;

import phone.contacts.rest.api.model.PhoneNumber;

import java.util.Optional;

public interface PhoneNumberService {
    PhoneNumber add(PhoneNumber phoneNumber);

    PhoneNumber get(Long id);

}
