package com.service.autenticacion.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.autenticacion.entity.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	Optional<Usuario> findByEmail(String email);

}
