import { useNavigate } from "react-router-dom";
import { createTrip } from "../api/tripApi";
import TripForm from "../components/TripForm";
import type { Trip } from "../types/Trip";

/**
 * Página para crear un nuevo viaje.
 */
function CreateTripPage() {
  const navigate = useNavigate();

  async function handleCreateTrip(trip: Trip) {
    try {
      await createTrip(trip);

      // Cuando se crea el viaje, volvemos a la lista
      navigate("/trips");
    } catch (error) {
      alert("No se pudo crear el viaje.");
    }
  }

  return (
    <main>
      <h1>Crear viaje</h1>

      <TripForm onCreateTrip={handleCreateTrip} />

      <button onClick={() => navigate("/trips")}>Volver</button>
    </main>
  );
}

export default CreateTripPage;