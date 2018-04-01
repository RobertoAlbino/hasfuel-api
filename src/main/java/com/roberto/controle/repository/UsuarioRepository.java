package com.roberto.controle.repository;

import com.roberto.controle.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
}
