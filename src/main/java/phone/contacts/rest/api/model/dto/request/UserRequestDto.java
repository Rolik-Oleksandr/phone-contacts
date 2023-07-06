package phone.contacts.rest.api.model.dto.request;

import phone.contacts.rest.api.lib.ValidEmail;
import javax.validation.constraints.Size;

public class UserRequestDto {
    @ValidEmail
    private String email;
    @Size(min = 8, max = 40)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
