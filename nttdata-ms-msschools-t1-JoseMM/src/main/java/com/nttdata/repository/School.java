package com.nttdata.repository;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase de la entidad Instituto
 * @author Jose
 *
 */
@Entity
@Table(name = "SCHOOL")
public class School implements Serializable {
	/** Serial Version **/
	private static final long serialVersionUID = 1L;

	/** Identificador (PK) **/
	private Long schoolId;
	
	/** Nombre **/
	private String name;
	
	/** Direccion **/
	private String address;
	
	/** Codigo postal **/
	private Long zipCode;

	/**
	 * Devuelve el id del instituto
	 * @return schoolId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SCHOOL_ID")
	public Long getSchoolId() {
		return schoolId;
	}

	/**
	 * Coloca el id del instituto
	 * @param schoolId (institutoId)
	 */
	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
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
	 * Devuelve la direccion
	 * @return address
	 */
	@Column(name = "ADDRESS")
	public String getAddress() {
		return address;
	}

	/**
	 * Coloca la direccion
	 * @param address (direccion)
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Devuelve el codigo postal
	 * @return zipCode
	 */
	@Column(name = "ZIPCODE")
	public Long getZipCode() {
		return zipCode;
	}

	/**
	 * Coloca el codigo postal
	 * @param zipCode (codigoPostal)
	 */
	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}
	
	
	
}
