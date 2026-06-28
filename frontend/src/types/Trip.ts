// Tipo que representa un viaje en el frontend.
export type Trip = {
  id?: number;          // Id del viaje. Es opcional porque al crear uno nuevo aun no existe.
  name: string;         // Nombre del viaje.
  destination: string;  // Destino principal.
  startDate: string;    // Fecha de inicio en formato "YYYY-MM-DD".
  endDate: string;      // Fecha de fin en formato "YYYY-MM-DD".
  description: string;  // Descripción o notas del viaje.
};