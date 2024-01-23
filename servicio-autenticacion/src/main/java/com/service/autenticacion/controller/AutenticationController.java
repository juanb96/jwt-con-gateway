package com.service.autenticacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.autenticacion.dto.AuthRequest;
import com.service.autenticacion.entity.Usuario;
import com.service.autenticacion.impl.AuthImpl;
import com.service.autenticacion.impl.AuthService;

import org.springframework.security.core.Authentication;

@RestController
@RequestMapping("/auth")
public class AutenticationController {
	
	@Autowired
    private AuthImpl authImpl;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/registro")
    public String addNewUser(@RequestBody Usuario user) {
        return authImpl.guardarUsuario(user);
    }

    @PostMapping("/token")
    public String getToken(@RequestBody AuthRequest authRequest) {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getEmail(), authRequest.getPassword()));
        if (authenticate.isAuthenticated()) {
            return authImpl.generarToken(authRequest.getEmail());
        } else {
            throw new RuntimeException("acceso invalido");
        }
    }

    @GetMapping("/validar")
    public String validateToken(@RequestParam("token") String token) {
        authImpl.validarToken(token);
        return "El token es válido";
    }

}
