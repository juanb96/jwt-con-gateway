package com.service.pedidos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.pedidos.dto.OrdenRespDTO;
import com.service.pedidos.impl.PedidosImpl;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {
	
	
	@Autowired
	private PedidosImpl impl;
	
	@GetMapping("/saludo")
	public String saludo() {
		return impl.saludo();
	}
	@GetMapping("/{ordenId}")
	public OrdenRespDTO verificarEstadoOrden(@PathVariable String ordenId) {
		return impl.verificarEstadoOrden(ordenId);
	}
}
