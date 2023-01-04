package com.michaelchen.login_springsecurity.service;

import com.michaelchen.login_springsecurity.model.AppUser;
import com.michaelchen.login_springsecurity.model.Role;

import java.util.List;

/**
 * @author Michael Chen
 * @date 1/3/2023
 * @version 1.0
 */
public interface UserService {
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers();
}
