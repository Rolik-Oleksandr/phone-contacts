package phone.contacts.rest.api.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import phone.contacts.rest.api.dao.AbstractDao;
import phone.contacts.rest.api.dao.ContactDao;
import phone.contacts.rest.api.exception.DataProcessingException;
import phone.contacts.rest.api.model.Contact;

import java.util.Optional;

@Repository
public class ContactDaoImpl extends AbstractDao<Contact> implements ContactDao {
    public ContactDaoImpl(SessionFactory factory) {
        super(factory, Contact.class);
    }

    @Override
    public Optional<Contact> findByEmail(String email) {
        try (Session session = factory.openSession()) {
            Query<Contact> findByEmail = session.createQuery(
                    "FROM Contact WHERE email = :email", Contact.class);
            findByEmail.setParameter("email", email);
            return findByEmail.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Contact with email " + email + " not found", e);
        }
    }
}
