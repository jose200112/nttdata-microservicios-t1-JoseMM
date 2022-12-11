package com.nttdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.nttdata.repository.School;
import com.nttdata.services.SchoolServiceI;

/**
 * Clase main
 * @author Jose
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NTTDataMain implements CommandLineRunner {
	
	@Autowired
	private SchoolServiceI schoolService;

	/**
	 * Metodo main
	 * @param args (main)
	 */
	public static void main(String[] args) {
		SpringApplication.run(NTTDataMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Creacion de institutos
		School s1 = new School();
		s1.setName("IES Sotero Hernandez");
		s1.setAddress("C. Santo Domingo de Guzman");
		s1.setZipCode(41920L);
		
		
		School s2 = new School();
		s2.setName("IES Alixar");
		s2.setAddress("Av. de la Unidad");
		s2.setZipCode(41950L);
		
		// Inserciones de institutos
		schoolService.insertSchool(s1);
		schoolService.insertSchool(s2);
		
	}

}
