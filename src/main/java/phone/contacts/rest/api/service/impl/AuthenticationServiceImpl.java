package phone.contacts.rest.api.service.impl;

import phone.contacts.rest.api.model.Role;
import phone.contacts.rest.api.model.User;
import phone.contacts.rest.api.service.AuthenticationService;
import phone.contacts.rest.api.service.RoleService;
import phone.contacts.rest.api.service.UserService;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final String USER = Role.RoleName.USER.name();
    private final UserService userService;
    private final RoleService roleService;

    public AuthenticationServiceImpl(UserService userService,
                                     RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setRoles(Set.of(roleService.getByName(USER)));
        userService.add(user);
        return user;
    }
}