package com.service.pedidos.impl;

import com.service.pedidos.dto.OrdenRespDTO;

public interface PedidosImpl {
	
	String saludo();
	OrdenRespDTO verificarEstadoOrden (String ordenId);

}
