package phone.contacts.rest.api.dao;

import phone.contacts.rest.api.model.Role;
import java.util.Optional;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getByName(String roleName);
}