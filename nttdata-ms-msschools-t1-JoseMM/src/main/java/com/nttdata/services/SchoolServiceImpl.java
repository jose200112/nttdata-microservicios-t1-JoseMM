package com.nttdata.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.repository.School;
import com.nttdata.repository.SchoolRepository;

/**
 * 
 * @author Jose
 * 
 * Servicio de Instituto
 *
 */
@Service
public class SchoolServiceImpl implements SchoolServiceI {

	@Autowired
	private SchoolRepository studentRepo;
	
	@Override
	public List<School> findAllSchools() {
		return studentRepo.findAll();
	}

	@Override
	public void insertSchool(School s) {
		studentRepo.save(s);
		
	}
	
	
}
