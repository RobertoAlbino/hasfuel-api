package com.roberto.controle.controllers;

import com.roberto.controle.repository.UserRepository;
import com.roberto.controle.service.MailService;
import com.roberto.controle.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserResource {
    private final Logger log = LoggerFactory.getLogger(UserResource.class);
    private final UserRepository userRepository;
    private final UserService userService;
    private final MailService mailService;

    public UserResource(UserRepository userRepository, UserService userService, MailService mailService) {
        this.userRepository = userRepository;
        this.userService = userService;
        this.mailService = mailService;
    }

}
