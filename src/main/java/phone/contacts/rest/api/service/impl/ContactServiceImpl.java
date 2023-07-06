package phone.contacts.rest.api.service.impl;

import org.springframework.stereotype.Service;
import phone.contacts.rest.api.dao.ContactDao;
import phone.contacts.rest.api.model.Contact;
import phone.contacts.rest.api.service.ContactService;

import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {
    private final ContactDao contactDao;

    public ContactServiceImpl(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    @Override
    public Contact add(Contact contact) {
        return contactDao.add(contact);
    }

    @Override
    public Contact get(Long id) {
        return contactDao.get(id)
                .orElseThrow(
                        () -> new RuntimeException("Contact with id: " + id + " not found"));
    }

    @Override
    public Optional<Contact> findByEmail(String email) {
        return contactDao.findByEmail(email);
    }
}
