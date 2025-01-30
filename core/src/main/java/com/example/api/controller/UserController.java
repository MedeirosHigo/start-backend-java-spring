package com.example.api.controller;

import com.example.api.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor

public class UserController {
    private UserService userService;

}
