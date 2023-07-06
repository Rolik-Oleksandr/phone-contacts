package phone.contacts.rest.api.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import phone.contacts.rest.api.dao.AbstractDao;
import phone.contacts.rest.api.dao.PhoneNumberDao;
import phone.contacts.rest.api.model.PhoneNumber;

@Repository
public class PhoneNumberDaoImpl extends AbstractDao<PhoneNumber> implements PhoneNumberDao {

    public PhoneNumberDaoImpl(SessionFactory factory) {
        super(factory, PhoneNumber.class);
    }
}
