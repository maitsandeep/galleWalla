package com.galleWalla.galleWalla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class GalleWallaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalleWallaApplication.class, args);
	}

}
