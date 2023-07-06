package phone.contacts.rest.api.dao;

import phone.contacts.rest.api.model.Contact;
import java.util.Optional;

public interface ContactDao {
    Contact add(Contact contact);

    Optional<Contact> get(Long id);

    Optional<Contact> findByEmail(String email);

}
