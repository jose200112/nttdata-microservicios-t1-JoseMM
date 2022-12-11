package com.nttdata.services;

import java.util.List;

import com.nttdata.repository.School;

/**
 * Interfaz del servicio instituto
 * @author Jose
 *
 */
public interface SchoolServiceI {
	
	/**
	 * Lista todos los institutos
	 * @return list
	 */
	public List<School> findAllSchools();
	
	/**
	 * Inserta un instituto
	 * @param s (instituto)
	 */
	public void insertSchool(School s);
}
