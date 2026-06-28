package com.lmr.travelplanner.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmr.travelplanner.model.Trip;
import com.lmr.travelplanner.service.TripService;

/**
 * Controlador REST encargado de exponer las operaciones relacionadas con los
 * viajes.
 * 
 * Define los endpoints de la API para crear, consultar, actualizar y eliminar
 * viajes.
 * 
 * @author Luis Menendez Ramos
 */
@RestController
@RequestMapping("/api/trips")
public class TripController {

	private final TripService tripService;

	public TripController(TripService tripService) {
		this.tripService = tripService;
	}

	/**
	 * Obtiene todos los viajes registrados.
	 * 
	 * @return lista de viajes
	 */
	@GetMapping
	public List<Trip> findAll() {
		return tripService.findAll();
	}

	/**
	 * Busca un viaje por su identificador.
	 * 
	 * @param id identificador del viaje
	 * @return viaje encontrado o respuesta 404 si no existe
	 */
	@GetMapping("/{id}")
	public ResponseEntity<Trip> findById(@PathVariable Long id) {
		return tripService.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	/**
	 * Crea un nuevo viaje.
	 * 
	 * @param trip viaje a crear
	 * @return viaje creado
	 */
	@PostMapping
	public Trip create(@RequestBody Trip trip) {
		return tripService.save(trip);
	}

	/**
	 * Actualiza un viaje existente.
	 * 
	 * @param id   identificador del viaje
	 * @param trip datos actualizados del viaje
	 * @return viaje actualizado o respuesta 404 si no existe
	 */
	@PutMapping("/{id}")
	public ResponseEntity<Trip> update(@PathVariable Long id, @RequestBody Trip trip) {
		if (!tripService.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		trip.setId(id);
		Trip updateTrip = tripService.save(trip);
		return ResponseEntity.ok(updateTrip);
	}

	/**
	 * Elimina un viaje por su identificador.
	 * 
	 * @param id identificador del viaje
	 * @return respuesta sin contenido o 404 si no existe
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Long id) {
		if (!tripService.existsById(id)) {
			return ResponseEntity.notFound().build();
		}

		tripService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
