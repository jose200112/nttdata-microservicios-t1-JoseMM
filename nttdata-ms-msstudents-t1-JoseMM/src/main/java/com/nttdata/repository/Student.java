package com.nttdata.repository;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Jose
 *
 * Clase Estudiante
 *
 */
@Entity
@Table(name = "STUDENT")
public class Student implements Serializable {
	/** Serial Version **/
	private static final long serialVersionUID = 1L;

	/**Identificador (PK) **/
	private Long studentId;
	
	/** Dni **/
	private String dni;
	
	/** Nombre **/
	private String name;
	
	/** Apellidos **/
	private String surnames;

	/**
	 * Devuelve el id del estudiante
	 * @return studentId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "STUDENT_ID")
	public Long getStudentId() {
		return studentId;
	}

	/**
	 * Coloca el id del estudiante
	 * @param studentId (estudianteId)
	 */
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	/**
	 * Devuelve el dni
	 * @return dni
	 */
	@Column(name = "DNI", nullable = false, unique = true)
	public String getDni() {
		return dni;
	}

	/**
	 * Coloca el dni
	 * @param dni (dni)
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Devuelve el nombre
	 * @return name
	 */
	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	/**
	 * Coloca el nombre
	 * @param name (nombre)
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Devuelve los apellidos
	 * @return surnames
	 */
	@Column(name = "SURNAMES")
	public String getSurnames() {
		return surnames;
	}

	/**
	 * Coloca los apellidos
	 * @param surnames (apellidos)
	 */
	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}
	
	
}
