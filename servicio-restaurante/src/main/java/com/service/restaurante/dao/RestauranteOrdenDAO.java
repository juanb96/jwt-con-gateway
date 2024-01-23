package com.service.restaurante.dao;




import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.service.restaurante.dto.OrdenRespDTO;

@Component
public class RestauranteOrdenDAO {
	
	
	public OrdenRespDTO obtenerOrden(String ordenId) {
		return generarOrdenesAlAzat().get(ordenId);
	}


	private Map<String, OrdenRespDTO> generarOrdenesAlAzat() {
		Map<String, OrdenRespDTO> ordenMap = new HashMap<>();
		ordenMap.put("35fds631", new OrdenRespDTO("35fds63", "CARNE", 34, 94, new Date(), "LISTA", 46));
		ordenMap.put("9u71245h", new OrdenRespDTO("9u71245h", "ARROZ CON POLLO", 2, 641, new Date(), "PREPARANDO", 59));
		ordenMap.put("37jbd832", new OrdenRespDTO("37jbd832", "CAZUELA DE FRIJOLES", 1, 325, new Date(), "ENTREGADA", 0));
		return ordenMap;
	}

}
