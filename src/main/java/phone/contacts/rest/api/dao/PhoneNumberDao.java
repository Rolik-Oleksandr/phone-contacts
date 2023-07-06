package phone.contacts.rest.api.dao;

import phone.contacts.rest.api.model.PhoneNumber;

import java.util.Optional;

public interface PhoneNumberDao {
    PhoneNumber add(PhoneNumber phoneNumber);

    Optional<PhoneNumber> get(Long id);

}
