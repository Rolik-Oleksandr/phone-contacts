package phone.contacts.rest.api.config;

import org.springframework.stereotype.Component;
import phone.contacts.rest.api.model.Role;
import phone.contacts.rest.api.model.User;
import phone.contacts.rest.api.service.RoleService;
import phone.contacts.rest.api.service.UserService;

import javax.annotation.PostConstruct;
import java.util.Set;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        roleService.add(userRole);
        User admin = new User();
        admin.setEmail("admin@mail.ua");
        admin.setPassword("123");
        admin.setRoles(Set.of(adminRole));

        User user = new User();
        user.setEmail("user@mail.ua");
        user.setPassword("123");
        user.setRoles(Set.of(userRole));
        userService.add(admin);
        userService.add(user);
    }
}
