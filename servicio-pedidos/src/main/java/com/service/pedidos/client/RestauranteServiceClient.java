package com.service.pedidos.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.service.pedidos.dto.OrdenRespDTO;

@Component
public class RestauranteServiceClient {
	@Autowired
    private RestTemplate template;

    public OrdenRespDTO estadoDePedido(String orderId) {
        return template.getForObject("http://RESTAURANTE-SERVICE/restaurante/ordenes/estado/" + orderId, OrdenRespDTO.class);
    }

}
