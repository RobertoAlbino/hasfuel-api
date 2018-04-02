package com.roberto.controle.controllers;

import com.roberto.controle.domain.Usuario;
import com.roberto.controle.service.UsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final Logger log = LoggerFactory.getLogger(UsuarioController.class);
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping(value = "/criar", consumes = "application/json",  produces="application/json")
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.criarUsuario(usuario);
    }

    @PutMapping(value = "/atualizar", consumes = "application/json",  produces="application/json")
    public Usuario atualizarUsuario(@RequestBody Usuario usuario) throws Exception {
        if (usuario.getId() == 0)
            throw new Exception("Não é possível atualizar uma entidade sem id.");

        return usuarioService.criarUsuario(usuario);
    }

    @DeleteMapping(value = "/remover", consumes = "application/json",  produces="application/json")
    public String removerUsuario(@RequestBody Usuario usuario) {
        return usuarioService.removerUsuario(usuario.getId());
    }

    @GetMapping(value = "/consultar", consumes = "application/json",  produces="application/json")
    public Usuario consultarUsuario(@RequestBody int idUsuario) {
        return usuarioService.consultarUsuario(idUsuario);
    }
}
