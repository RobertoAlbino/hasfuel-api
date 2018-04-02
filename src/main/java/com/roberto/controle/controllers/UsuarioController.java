package com.roberto.controle.controllers;

import com.roberto.controle.domain.Usuario;
import com.roberto.controle.service.UsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UsuarioController {
    private final Logger log = LoggerFactory.getLogger(UsuarioController.class);
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping(value = "/usuarios", consumes = "application/json",  produces="application/json")
    public String criarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.criarUsuario(usuario).toString();
    }





}
