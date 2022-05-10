package com.alejo.matrixpattern;

import com.alejo.commons.utilities.Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
@ComponentScan(
    includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class),
    value = {"com.alejo"}
)
public class MatrizpatternApplication {

	public static void main(String[] args) {
		System.out.println("iniciando...");
		SpringApplication.run(MatrizpatternApplication.class, args);
		System.out.println("finalizando");
	}

}
