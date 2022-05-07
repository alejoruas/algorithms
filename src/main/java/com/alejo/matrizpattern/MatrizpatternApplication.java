package com.alejo.matrizpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
public class MatrizpatternApplication {

	public static void main(String[] args) {
		System.out.println("iniciando...");
		SpringApplication.run(MatrizpatternApplication.class, args);
		System.out.println("finalizando");
	}

}