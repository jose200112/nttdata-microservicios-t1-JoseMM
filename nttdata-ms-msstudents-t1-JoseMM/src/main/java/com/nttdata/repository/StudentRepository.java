package com.nttdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @author Jose
 * 
 * Interfaz del repositorio
 * 
 */
public interface StudentRepository extends JpaRepository<Student, Long> {

}
