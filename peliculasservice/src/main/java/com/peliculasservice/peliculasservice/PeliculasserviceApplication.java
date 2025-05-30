package com.peliculasservice.peliculasservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient 

public class PeliculasserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeliculasserviceApplication.class, args);
	}

}
