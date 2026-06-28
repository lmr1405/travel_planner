import { useNavigate } from "react-router-dom";
import type { Trip } from "../types/Trip";

type TripCardProps = {
  trip: Trip;
};

/**
 * Componente que muestra la información de un viaje.
 */
function TripCard({ trip }: TripCardProps) {
  const navigate = useNavigate();

  return (
    <div>
      <h3>{trip.name}</h3>
      <p>Destino: {trip.destination}</p>
      <p>Fecha de inicio: {trip.startDate}</p>
      <p>Fecha de fin: {trip.endDate}</p>
      <p>Descripción: {trip.description}</p>

      {trip.id !== undefined && (
        <button onClick={() => navigate(`/trips/delete/${trip.id}`)}>
          Eliminar
        </button>
      )}
    </div>
  );
}

export default TripCard;