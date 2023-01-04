package com.michaelchen.login_springsecurity.api;

import com.michaelchen.login_springsecurity.model.AppUser;
import com.michaelchen.login_springsecurity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Michael Chen
 * @date 1/3/2023
 * @version 1.0
 */
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserService userservice;
    @GetMapping("/users")
    public ResponseEntity<List<AppUser>>getUsers() {
        return ResponseEntity.ok().body(userservice.getUsers());
    }
}
