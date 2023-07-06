package phone.contacts.rest.api.model.dto.request;

import phone.contacts.rest.api.lib.PhoneValid;
import phone.contacts.rest.api.model.Contact;

public class PhoneNumberRequestDto {
    @PhoneValid
    private String phone;
    private Contact contact;

    public String getPhone() {
        return phone;
    }

    public Contact getContact() {
        return contact;
    }
}
