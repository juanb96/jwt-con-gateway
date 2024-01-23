package com.service.autenticacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServicioAutenticacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioAutenticacionApplication.class, args);
	}

}
