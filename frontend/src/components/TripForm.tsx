import { useState } from "react";
import type { FormEvent } from "react";
import type { Trip } from "../types/Trip";

type TripFormProps = {
  onCreateTrip: (trip: Trip) => void;
};

/**
 * Formulario para crear un nuevo viaje.
 */
function TripForm({ onCreateTrip }: TripFormProps) {
  const [name, setName] = useState("");
  const [destination, setDestination] = useState("");
  const [startDate, setStartDate] = useState("");
  const [endDate, setEndDate] = useState("");
  const [description, setDescription] = useState("");

  function handleSubmit(event: FormEvent) {
    event.preventDefault();

    const newTrip: Trip = {
      name,
      destination,
      startDate,
      endDate,
      description,
    };

    onCreateTrip(newTrip);

    setName("");
    setDestination("");
    setStartDate("");
    setEndDate("");
    setDescription("");
  }

  return (
    <form onSubmit={handleSubmit}>
      <h2>Crear nuevo viaje</h2>

      <div>
        <label>Nombre del viaje: </label>
        <input
          type="text"
          value={name}
          onChange={(event) => setName(event.target.value)}
        />
      </div>

      <div>
        <label>Destino: </label>
        <input
          type="text"
          value={destination}
          onChange={(event) => setDestination(event.target.value)}
        />
      </div>

      <div>
        <label>Fecha de inicio: </label>
        <input
          type="date"
          value={startDate}
          onChange={(event) => setStartDate(event.target.value)}
        />
      </div>

      <div>
        <label>Fecha de fin: </label>
        <input
          type="date"
          value={endDate}
          onChange={(event) => setEndDate(event.target.value)}
        />
      </div>

      <div>
        <label>Descripción: </label>
        <textarea
          value={description}
          onChange={(event) => setDescription(event.target.value)}
        />
      </div>

      <button type="submit">Guardar Viaje: </button>
    </form>
  );
}

export default TripForm;