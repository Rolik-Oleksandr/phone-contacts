package phone.contacts.rest.api.service.impl;

import phone.contacts.rest.api.dao.RoleDao;
import phone.contacts.rest.api.model.Role;
import phone.contacts.rest.api.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getByName(String roleName) {
        return roleDao.getByName(roleName).orElseThrow(
                () -> new RuntimeException("Can't find role with name: " + roleName)
        );
    }
}