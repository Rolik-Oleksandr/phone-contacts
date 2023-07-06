package phone.contacts.rest.api.service;

import phone.contacts.rest.api.model.Contact;
import java.util.Optional;

public interface ContactService {
    Contact add(Contact contact);

    Contact get(Long id);

    Optional<Contact> findByEmail(String email);

}
