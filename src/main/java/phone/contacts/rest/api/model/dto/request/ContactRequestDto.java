package phone.contacts.rest.api.model.dto.request;

import phone.contacts.rest.api.lib.ValidEmail;

public class ContactRequestDto {
    private String name;
    @ValidEmail
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
