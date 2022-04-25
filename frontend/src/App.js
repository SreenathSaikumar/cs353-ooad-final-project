import { Routes, Route } from "react-router-dom";
import { ToastContainer } from "react-toastify";
import HomePage from "./HomePage";
import ProductPage from "./ProductPage";

export default function App() {
  return (
    <>
      <ToastContainer />
      <Routes>
        <Route path="/" element={<HomePage />} />
        <Route path="/product" element={<ProductPage />} />
      </Routes>
    </>
  );
}
