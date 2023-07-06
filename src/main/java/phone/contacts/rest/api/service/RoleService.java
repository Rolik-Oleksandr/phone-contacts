package phone.contacts.rest.api.service;

import phone.contacts.rest.api.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(String roleName);
}