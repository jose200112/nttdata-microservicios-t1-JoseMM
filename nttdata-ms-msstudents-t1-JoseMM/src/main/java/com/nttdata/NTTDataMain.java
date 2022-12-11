package com.nttdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.nttdata.repository.Student;
import com.nttdata.services.StudentServiceI;

/**
 * Clase main
 * @author Jose
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NTTDataMain implements CommandLineRunner {
	
	@Autowired
	private StudentServiceI studentService;

	/**
	 * Metodo main
	 * @param args (main)
	 */
	public static void main(String[] args) {
		SpringApplication.run(NTTDataMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Creacion de estudiantes
		Student s1 = new Student();
		s1.setName("Juan");
		s1.setSurnames("Lopez Garcia");
		s1.setDni("23657645R");
		
		Student s2 = new Student();
		s2.setName("Laura");
		s2.setSurnames("Martinez Gonzalez");
		s2.setDni("56943543E");
		
		// Inserciones de estudiantes
		studentService.insertStudent(s1);
		studentService.insertStudent(s2);
		
	}

}
