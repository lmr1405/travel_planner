package com.lmr.travelplanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lmr.travelplanner.model.Trip;

/**
 * Repositorio de acceso a datos para la entidad {@link Trip}.
 * 
 * En esta aplicación, el repositorio cumple el papel de DAO
 * (Data Access Object), centralizando las operaciones de persistencia
 * relacionadas con los viajes.
 * 
 * Al extender {@link JpaRepository}, Spring Data JPA proporciona
 * automáticamente operaciones CRUD básicas como guardar, buscar,
 * listar y eliminar registros.
 * 
 * @author Luis Menendez Ramos
 */
public interface TripRepository extends JpaRepository<Trip, Long>{
	
}
