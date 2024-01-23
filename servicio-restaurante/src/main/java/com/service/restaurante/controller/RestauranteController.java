package com.service.restaurante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.restaurante.dto.OrdenRespDTO;
import com.service.restaurante.service.RestauranteService;
import com.service.restaurante.service.RestauranteServiceImpl;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

    @Autowired
    private RestauranteServiceImpl restauranteImpl;

    @GetMapping
    public String saludo() {
        return restauranteImpl.saludo();
    }

    @GetMapping("/ordenes/estado/{ordenId}")
    public OrdenRespDTO getOrder(@PathVariable String ordenId) {
        return restauranteImpl.obtenerOrden(ordenId);
    }
}