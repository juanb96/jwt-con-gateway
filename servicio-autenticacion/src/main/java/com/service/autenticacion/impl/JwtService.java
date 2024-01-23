package com.service.autenticacion.impl;

import java.security.Key;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;


@Component
public class JwtService implements JwtImpl{
	
	public static final String SECRET = "5367566B59703373367639792F423F4528482B4D6251655468576D5A71347437";

	@Override
	public void validarToken(String token) {
		Jwts.parserBuilder().setSigningKey(obtenerSingKey()).build().parseClaimsJws(token);
    }

	@Override
	public String generarToken(String usuario) {
		Map<String, Object> claims = new HashMap<>();
        return CrearToken(claims, usuario);
	}

	@Override
	public String CrearToken(Map<String, Object> claims, String usuario) {
		return Jwts.builder()
                .setClaims(claims)
                .setSubject(usuario)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 30))
                .signWith(obtenerSingKey(), SignatureAlgorithm.HS256).compact();
    }

	@Override
	public Key obtenerSingKey() {
		byte[] keyBytes = Decoders.BASE64.decode(SECRET);
        return Keys.hmacShaKeyFor(keyBytes);	
	}

}
