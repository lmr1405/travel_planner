package com.lmr.travelplanner.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lmr.travelplanner.model.Trip;
import com.lmr.travelplanner.repository.TripRepository;

/**
 * Servicio encargado de gestionar las operaciones relacionadas con los viajes.
 * 
 * Esta capa centraliza la lógica de negocio de la aplicación y actúa como
 * intermediaria entre los controladores REST y la capa de acceso a datos.
 * 
 * @author Luis Menendez Ramos
 */
@Service
public class TripService {
	
	private final TripRepository tripRepository;
	
	private TripService(TripRepository tripRepository) {
		this.tripRepository = tripRepository;
	}	
	
	/**
	 * Obtiene todos los viajes registrados.
	 * 
	 * @return lista de viajes
	 */
	public List<Trip> findAll() {
		return tripRepository.findAll();
	}
	
	/**
	 * Busca un viaje por su identificador.
	 * 
	 * @param id identificador del viaje
	 * @return viaje encontrado, si existe
	 */
	public Optional<Trip> findById(long id){
		return tripRepository.findById(id);
	}
	
	/**
	 * Guarda un viaje.
	 * 
	 * @param trip viaje a guardar
	 * @return viaje guardado
	 */
	public Trip save(Trip trip) {
		return tripRepository.save(trip);
	}
	
	/**
	 * Elimina un viaje por su identificador.
	 * 
	 * @param id identificador del viaje
	 */
	public void deleteById(Long id) {
		tripRepository.deleteById(id);
	}
	
	/**
	 * Comprueba si existe un viaje con el identificador indicado.
	 * 
	 * @param id identificador del viaje
	 * @return true si existe, false en caso contrario
	 */
	public boolean existsById(Long id) {
		return tripRepository.existsById(id);
	}
	

}
