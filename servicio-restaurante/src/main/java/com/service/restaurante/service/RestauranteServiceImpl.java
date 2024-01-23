package com.service.restaurante.service;

import com.service.restaurante.dto.OrdenRespDTO;



public interface RestauranteServiceImpl {
	String saludo();
	OrdenRespDTO obtenerOrden(String ordenId);

}
