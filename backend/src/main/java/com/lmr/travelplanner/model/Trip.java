package com.lmr.travelplanner.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entidad que representa un viaje dentro de la aplicación Travel Planner.
 * 
 * Un viaje almacena la información básica necesaria para organizarlo,
 * como el nombre, el destino, la fecha de inicio, la fecha de fin
 * y una descripción general.
 * 
 * @author Luis Menendez Ramos
 */
@Entity
@Table(name = "trips")
public class Trip {
	
	/**
	 * Identificador único del viaje.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/**
	 * Nombre del viaje.
	 */
	@Column(name = "name")
	private String name;
	
	/**
	 * Destino principal del viaje.
	 */
	@Column(name = "destination")
	private String destination;
	
	/**
	 * Fecha de inicio del viaje.
	 */
	@Column(name = "start_date")
	private LocalDate startDate;
	
	/**
	 * Fecha de fin del viaje.
	 */
	@Column(name = "end_date")
	private LocalDate endDate;
	
	/**
	 * Descripción o notas generales sobre el viaje.
	 */
	@Column(name = "description")
	private String description;

	/**
	 * Constructor vacío requerido por JPA.
	 */
	public Trip() {
		
	}

	/**
	 * Devuelve el identificador del viaje.
	 * 
	 * @return identificador del viaje
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Establece el identificador del viaje.
	 * 
	 * @param id identificador del viaje
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Devuelve el nombre del viaje.
	 * 
	 * @return nombre del viaje
	 */
	public String getName() {
		return name;
	}

	/**
	 * Establece el nombre del viaje.
	 * 
	 * @param name nombre del viaje
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Devuelve el destino principal del viaje.
	 * 
	 * @return destino principal del viaje
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * Establece el destino principal del viaje.
	 * 
	 * @param destination destino principal del viaje
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * Devuelve la fecha de inicio del viaje.
	 * 
	 * @return fecha de inicio del viaje
	 */
	public LocalDate getStartDate() {
		return startDate;
	}

	/**
	 * Establece la fecha de inicio del viaje.
	 * 
	 * @param startDate fecha de inicio del viaje
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	/**
	 * Devuelve la fecha de fin del viaje.
	 * 
	 * @return fecha de fin del viaje
	 */
	public LocalDate getEndDate() {
		return endDate;
	}

	/**
	 * Establece la fecha de fin del viaje.
	 * 
	 * @param endDate fecha de fin del viaje
	 */
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	/**
	 * Devuelve la descripción del viaje.
	 * 
	 * @return descripción del viaje
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Establece la descripción del viaje.
	 * 
	 * @param description descripción del viaje
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}