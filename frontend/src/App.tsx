import { BrowserRouter, Navigate, Route, Routes } from "react-router-dom";
import TripsPage from "./pages/TripsPage";
import CreateTripPage from "./pages/CreateTripPage";
import DeleteTripPage from "./pages/DeleteTripPage";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Navigate to="/trips" />} />
        <Route path="/trips" element={<TripsPage />} />
        <Route path="/trips/new" element={<CreateTripPage />} />
        <Route path="/trips/delete/:id" element={<DeleteTripPage />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;