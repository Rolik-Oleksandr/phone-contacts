package phone.contacts.rest.api.service;

import phone.contacts.rest.api.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}