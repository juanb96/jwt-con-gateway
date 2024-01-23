package com.service.autenticacion.config;

import java.util.Optional;

import com.service.autenticacion.entity.Usuario;
import com.service.autenticacion.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService{

	@Autowired
	private UsuarioRepository usuariorepo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		 Optional<Usuario> credential = usuariorepo.findByEmail(email);
	        return credential.map(DetallesDeUsuario::new).orElseThrow(() -> new UsernameNotFoundException("usuario no encontrado con nombre:" + email));
	}

}
