package com.itcsoluciones.pruebaapirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebaApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaApiRestApplication.class, args);
		System.out.println("Funcionando en el puerto 8080");
	}

}
