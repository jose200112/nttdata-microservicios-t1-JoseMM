package com.nttdata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.services.SchoolServiceI;
import com.nttdata.repository.School;

import java.util.List;

/**
 * Controlador de Instituto
 * @author Jose
 *
 */
@RestController("api")
public class SchoolController {
	@Autowired
	private SchoolServiceI studentService;
	
	/**
	 * Lista todos los institutos
	 * @return list
	 */
	@GetMapping("/getSchoolsInfo")
	public List<School> showCustomers(){
		return studentService.findAllSchools();
		
	}

	
	
}
