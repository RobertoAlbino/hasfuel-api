package com.roberto.controle.controllers;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
@RequestMapping("/api")
public class UsuarioController {
    private final Logger log = LoggerFactory.getLogger(UsuarioController.class);
    //private final UsuarioRepository usuarioRepository;
    //private final UsuarioService usuarioService;

    @GetMapping(value = "/usuarios", consumes = "application/json",  produces="application/json")
    @JsonSerialize
    public String consultarUsuario() {
        return "Roberto Albino Junior";
    }



}
