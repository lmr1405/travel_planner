import { useNavigate, useParams } from "react-router-dom";
import { deleteTrip } from "../api/tripApi";

/**
 * Página para confirmar la eliminación de un viaje.
 */
function DeleteTripPage() {
  const navigate = useNavigate();
  const { id } = useParams();

  async function handleDeleteTrip() {
    if (id === undefined) {
      alert("No se ha encontrado el viaje.");
      return;
    }

    try {
      await deleteTrip(Number(id));
      navigate("/trips");
    } catch (error) {
      alert("No se pudo eliminar el viaje.");
    }
  }

  return (
    <main>
      <h1>Eliminar viaje</h1>

      <p>¿Seguro que quieres eliminar este viaje?</p>

      <div className="button-group">
  <button onClick={() => navigate("/trips")}>
    Cancelar
  </button>

  <button onClick={handleDeleteTrip}>
    Eliminar definitivamente
  </button>
</div>
    </main>
  );
}

export default DeleteTripPage;