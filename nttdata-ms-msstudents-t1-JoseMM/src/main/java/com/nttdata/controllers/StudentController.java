package com.nttdata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.services.StudentServiceI;
import com.nttdata.repository.Student;

import java.util.List;

/**
 * Controlador de estudiante
 * 
 * @author Jose
 *
 */
@RestController("api")
public class StudentController {
	@Autowired
	private StudentServiceI studentService;
	
	/**
	 * Lista todos los estudiantes
	 * @return list
	 */
	@GetMapping("/getStudentsInfo")
	public List<Student> showCustomers(){
		return studentService.findAllStudents();
		
	}

	
	
}
