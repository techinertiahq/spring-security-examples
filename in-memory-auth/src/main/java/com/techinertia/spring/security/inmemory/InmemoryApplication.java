package com.techinertia.spring.security.inmemory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class InmemoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InmemoryApplication.class, args);
	}

}
