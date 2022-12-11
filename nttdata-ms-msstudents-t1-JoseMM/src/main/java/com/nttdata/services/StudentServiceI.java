package com.nttdata.services;

import java.util.List;

import com.nttdata.repository.Student;

/**
 * 
 * @author Jose
 * 
 * Interfaz del servicio
 *
 */
public interface StudentServiceI {
	
	/**
	 * Devuelve una lista de estudiantes
	 * @return list (lista)
	 */
	public List<Student> findAllStudents();
	
	/**
	 * Inserta un estudiante
	 * @param s (estudiante)
	 */
	public void insertStudent(Student s);
}
