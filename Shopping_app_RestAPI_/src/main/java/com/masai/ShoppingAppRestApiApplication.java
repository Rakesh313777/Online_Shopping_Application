package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@OpenAPIDefinition(
		
		servers = {
				@Server(url = "/",description = "Default server URL")
		}
		)

@SpringBootApplication
@EnableSwagger2
public class ShoppingAppRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingAppRestApiApplication.class, args);
	}

}
