package com.nttdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @author Jose
 *
 * Clase main de Gateway
 * 
 */
@SpringBootApplication
@EnableEurekaClient
public class NTTDataMain {

	/**
	 * Metodo main
	 * 
	 * @param args (main)
	 */
	public static void main(String[] args) {
		SpringApplication.run(NTTDataMain.class, args);
	}

}
