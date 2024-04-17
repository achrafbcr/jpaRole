package com.achraf.jparole.service;

import com.achraf.jparole.entities.Role;
import com.achraf.jparole.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUsername(String username);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String username , String roleName);
    User authenticate(String userName , String password);
}
