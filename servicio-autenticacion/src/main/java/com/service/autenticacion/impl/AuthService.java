package com.service.autenticacion.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.service.autenticacion.entity.Usuario;
import com.service.autenticacion.repository.UsuarioRepository;


@Service
public class AuthService implements AuthImpl{

	@Autowired
    private UsuarioRepository repository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtImpl jwtImpl;
    

    public String guardarUsuario(Usuario credential) {
        credential.setPassword(passwordEncoder.encode(credential.getPassword()));
        repository.save(credential);
        return "Usuario creado";
    }

    public String generarToken(String username) {
        return jwtImpl.generarToken(username);
    }

    public void validarToken(String token) {
        jwtImpl.validarToken(token);
    }

	


}
