package com.roberto.controle.test.controllers;

import com.roberto.controle.controllers.UsuarioController;
import com.roberto.controle.domain.Usuario;

import com.roberto.controle.domain.base.RetornoBaseModel;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

import java.rmi.server.ExportException;
import java.util.Random;

public class UsuarioControllerTest {
    @Mock
    private UsuarioController usuarioController;

    private Usuario usuario;

    @Before
    public void inicializar() {
        MockitoAnnotations.initMocks(this);
        mock(this.getClass(), withSettings().verboseLogging());
        usuario = new Usuario();
        usuario.setId(0);
        usuario.setLogin("usuarioteste" + new Random().ints());
        usuario.setSenha("senhasenhasenhasenha" + new Random().ints());
        usuario.setEmail("testes" + new Random().ints() + "tetestestete@gmail.com");
    }

    @Ignore
    public void testarSeAtualizaoDeUsuarioBloqueiaUsuarioSemIdInformado() throws Exception {
        usuarioController.atualizarUsuario(this.usuario);
    }
}
