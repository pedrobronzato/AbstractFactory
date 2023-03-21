package org.example;

public class Medico {

    private Paciente paciente;
    private Itinerario itinerario;

    public Medico (FabricaAbstrata fabrica) {
        this.paciente = fabrica.createPaciente();
        this.itinerario = fabrica.createItinerario();
    }

    public String emitirDadosPaciente() {
        return this.paciente.emitir();
    }

    public String emitirItinerario() {
        return this.itinerario.emitir();
    }
}
