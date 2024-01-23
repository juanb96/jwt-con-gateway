package com.service.restaurante.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.restaurante.dao.RestauranteOrdenDAO;
import com.service.restaurante.dto.OrdenRespDTO;

@Service
public class RestauranteService implements RestauranteServiceImpl {

	@Autowired
	private RestauranteOrdenDAO dao;

	@Override
	public String saludo() {
		// TODO Auto-generated method stub
		return "Bienvenido al servicio de restaurante";
	}

	@Override
	public OrdenRespDTO obtenerOrden(String ordenId) {
		// TODO Auto-generated method stub
		return dao.obtenerOrden(ordenId);
	}

}
