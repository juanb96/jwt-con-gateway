package com.service.pedidos.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.service.pedidos.client.RestauranteServiceClient;
import com.service.pedidos.dto.OrdenRespDTO;


@Service
public class PedidosService implements PedidosImpl{

	
	@Autowired 
    private RestauranteServiceClient client;
	
	@Override
	public String saludo() {
		return "Bienvenido al servicio de pedidos";
	}

	@Override
	public OrdenRespDTO verificarEstadoOrden(String ordenId) {
		// TODO Auto-generated method stub
		return client.estadoDePedido(ordenId);
	}

}
