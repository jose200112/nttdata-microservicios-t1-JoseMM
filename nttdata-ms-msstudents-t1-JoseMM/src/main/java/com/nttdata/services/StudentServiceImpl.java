package com.nttdata.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.repository.Student;
import com.nttdata.repository.StudentRepository;

/**
 * Servicio de Estudiantes
 * @author maria
 *
 */
@Service
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public List<Student> findAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public void insertStudent(Student s) {
		studentRepo.save(s);
		
	}
	
	
}
