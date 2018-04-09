package com.roberto.controle.controllers;

import com.roberto.controle.domain.base.RetornoBaseModel;
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
    private RetornoBaseModel objetoRetorno;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping(value = "/criar", consumes = "application/json",  produces="application/json")
    public RetornoBaseModel criarUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioRetorno = usuarioService.criarUsuario(usuario);
        objetoRetorno = new RetornoBaseModel();
        objetoRetorno.setSucesso(true);
        objetoRetorno.setMensagem("Usuário criado com sucesso.");
        objetoRetorno.setObjeto(usuarioRetorno);
        return objetoRetorno;
    }

    @PutMapping(value = "/atualizar", consumes = "application/json",  produces="application/json")
    public RetornoBaseModel atualizarUsuario(@RequestBody Usuario usuario) throws Exception {
        if (usuario.getId() == 0)
            throw new Exception("Não é possível atualizar uma entidade sem id.");

        Usuario usuarioRetorno = usuarioService.criarUsuario(usuario);
        objetoRetorno = new RetornoBaseModel();
        objetoRetorno.setSucesso(true);
        objetoRetorno.setMensagem("Usuário atualizado com sucesso.");
        objetoRetorno.setObjeto(usuarioRetorno);
        return objetoRetorno;
    }

    @DeleteMapping(value = "/remover", consumes = "application/json",  produces="application/json")
    public RetornoBaseModel removerUsuario(@RequestBody Usuario usuario) throws Exception {
        if (usuario.getId() == 0)
            throw new Exception("Não é possível excluir uma entidade sem id.");

        usuarioService.removerUsuario(usuario.getId());
        objetoRetorno = new RetornoBaseModel();
        objetoRetorno.setSucesso(true);
        objetoRetorno.setMensagem("Usuário removido com sucesso.");
        objetoRetorno.setObjeto(new Object());
        return objetoRetorno;
    }

    @GetMapping(value = "/consultar", consumes = "application/json",  produces="application/json")
    public RetornoBaseModel consultarUsuario(@RequestBody Usuario usuario) throws Exception {
        if (usuario.getId() == 0)
            throw new Exception("Não é possível consultar sem um id.");

        Usuario usuarioRetorno = usuarioService.consultarUsuario(usuario.getId());
        objetoRetorno = new RetornoBaseModel();
        objetoRetorno.setSucesso(true);
        objetoRetorno.setMensagem("Usuário consultado com sucesso.");
        objetoRetorno.setObjeto(usuarioRetorno);
        return objetoRetorno;
    }
}
