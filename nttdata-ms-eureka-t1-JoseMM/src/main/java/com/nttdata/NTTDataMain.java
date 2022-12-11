package com.nttdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Clase main de Eureka
 * @author Jose
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class NTTDataMain {

	/**
	 * Metodo main
	 * @param args (main)
	 */
	public static void main(String[] args) {
		SpringApplication.run(NTTDataMain.class, args);
	}

}
