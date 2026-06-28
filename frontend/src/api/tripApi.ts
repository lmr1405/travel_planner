import type { Trip } from "../types/Trip";

// Dirección base de la API del backend
const API_URL = "http://localhost:8080/api/trips";

/**
 * Obtiene todos los viajes guardados en la base de datos.
 */
export async function getTrips(): Promise<Trip[]> {
  const response = await fetch(API_URL);

  // Si la respuesta del backend no es correcta, lanzamos un error
  if (!response.ok) {
    throw new Error("Error al obtener los viajes");
  }

  // Convertimos la respuesta JSON en una lista de viajes
  return response.json();
}

/**
 * Obtiene un viaje concreto usando su id.
 */
export async function getTripById(id: number): Promise<Trip> {
  const response = await fetch(`${API_URL}/${id}`);

  if (!response.ok) {
    throw new Error("Error al obtener el viaje");
  }

  // Convertimos la respuesta JSON en un objeto Trip
  return response.json();
}

/**
 * Crea un nuevo viaje en la base de datos.
 */
export async function createTrip(trip: Trip): Promise<Trip> {
  const response = await fetch(API_URL, {
    method: "POST", // Indicamos que queremos crear un recurso
    headers: {
      "Content-Type": "application/json", // Enviamos datos en formato JSON
    },
    body: JSON.stringify(trip), // Convertimos el objeto Trip a JSON
  });

  if (!response.ok) {
    throw new Error("Error al crear el viaje");
  }

  // Devolvemos el viaje creado por el backend
  return response.json();
}

/**
 * Actualiza un viaje existente usando su id.
 */
export async function updateTrip(id: number, trip: Trip): Promise<Trip> {
  const response = await fetch(`${API_URL}/${id}`, {
    method: "PUT", // Indicamos que queremos actualizar un recurso
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(trip),
  });

  if (!response.ok) {
    throw new Error("Error al actualizar el viaje");
  }

  // Devolvemos el viaje actualizado
  return response.json();
}

/**
 * Elimina un viaje usando su id.
 */
export async function deleteTrip(id: number): Promise<void> {
  const response = await fetch(`${API_URL}/${id}`, {
    method: "DELETE", // Indicamos que queremos borrar un recurso
  });

  if (!response.ok) {
    throw new Error("Error al eliminar el viaje");
  }

  // No devolvemos nada porque solo estamos borrando
}