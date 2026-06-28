import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import type { Trip } from "../types/Trip";
import { getTrips } from "../api/tripApi";
import TripList from "../components/TripList";

/**
 * Página principal para mostrar los viajes.
 */
function TripsPage() {
  const [trips, setTrips] = useState<Trip[]>([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState("");

  const navigate = useNavigate();

  /**
   * Carga los viajes desde el backend.
   */
  async function loadTrips() {
    try {
      const data = await getTrips();
      setTrips(data);
    } catch (error) {
      setError("No se pudieron cargar los viajes.");
    } finally {
      setLoading(false);
    }
  }

  /**
   * Se ejecuta una vez cuando se carga la página.
   */
  useEffect(() => {
    loadTrips();
  }, []);

  if (loading) {
    return <p>Cargando viajes...</p>;
  }

  if (error) {
    return <p>{error}</p>;
  }

  return (
    <main>
      <h1>Travel Planner</h1>
      <h2>Mis viajes</h2>

      <button onClick={() => navigate("/trips/new")}>
        Nuevo viaje
      </button>

      <TripList trips={trips} />
    </main>
  );
}

export default TripsPage;