package com.michaelchen.login_springsecurity.repo;

import com.michaelchen.login_springsecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author Michael Chen
 * @date 1/3/2023
 * @version 1.0
 */
public interface RoleRepo extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
