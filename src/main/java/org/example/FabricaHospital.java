package org.example;
public class FabricaHospital implements  FabricaAbstrata {
    @Override
    public Paciente createPaciente() {
        return new PacienteHospital();
    }

    @Override
    public Itinerario createItinerario() {
        return new ItinerarioHospital();
    }

}
