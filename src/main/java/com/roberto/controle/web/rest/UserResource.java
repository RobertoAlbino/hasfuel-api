package com.roberto.controle.web.rest;

import com.roberto.controle.config.Constants;
import com.codahale.metrics.annotation.Timed;
import com.roberto.controle.domain.User;
import com.roberto.controle.repository.UserRepository;
import com.roberto.controle.service.MailService;
import com.roberto.controle.service.UserService;
import com.roberto.controle.service.dto.UserDTO;
import com.roberto.controle.web.rest.errors.BadRequestAlertException;
import com.roberto.controle.web.rest.errors.EmailAlreadyUsedException;
import com.roberto.controle.web.rest.errors.LoginAlreadyUsedException;
import com.roberto.controle.web.rest.util.HeaderUtil;
import com.roberto.controle.web.rest.util.PaginationUtil;
import io.github.jhipster.web.util.ResponseUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

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
