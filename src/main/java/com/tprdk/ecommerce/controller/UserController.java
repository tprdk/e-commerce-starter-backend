package com.tprdk.ecommerce.controller;

import com.tprdk.ecommerce.entity.UserDto;
import com.tprdk.ecommerce.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{username}")
    public UserDto getUser(@PathVariable String username){
        return this.userService.getUser(username);
    }
}
