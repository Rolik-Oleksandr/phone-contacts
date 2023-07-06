package phone.contacts.rest.api.model.dto.response;

import phone.contacts.rest.api.model.Contact;

public class PhoneNumberResponseDto {
    private String phoneNumber;
    private Contact contact;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
