package org.example;

public class FabricaClinica implements  FabricaAbstrata {
    @Override
    public Paciente createPaciente() {
        return new PacienteClinica();
    }

    @Override
    public Itinerario createItinerario() {
        return new ItinerarioClinica();
    }

}
