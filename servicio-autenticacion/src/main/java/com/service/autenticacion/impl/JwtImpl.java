package com.service.autenticacion.impl;

import java.security.Key;
import java.util.Map;


public interface JwtImpl {
	void validarToken(String token);
	String generarToken(String usuario);
	String CrearToken(Map<String, Object>claims, String usuario);
	Key obtenerSingKey();

}
