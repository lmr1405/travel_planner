import type { Trip } from "../types/Trip";
import TripCard from "./TripCard";

type TripListProps = {
  trips: Trip[];
};

/**
 * Componente que muestra una lista de viajes.
 */
function TripList({ trips }: TripListProps) {
  if (trips.length === 0) {
    return <p>No hay viajes guardados.</p>;
  }

  return (
    <div>
      {trips.map((trip) => (
        <TripCard key={trip.id} trip={trip} />
      ))}
    </div>
  );
}

export default TripList;