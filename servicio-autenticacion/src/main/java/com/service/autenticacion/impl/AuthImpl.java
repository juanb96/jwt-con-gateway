package com.service.autenticacion.impl;

import com.service.autenticacion.entity.Usuario;

public interface AuthImpl {
	
	 String guardarUsuario (Usuario usuario);
	 String generarToken (String usuario);
	 void validarToken (String token);

}
 