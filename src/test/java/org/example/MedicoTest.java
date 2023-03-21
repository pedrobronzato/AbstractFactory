package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicoTest {

    @Test
    void deveEmitirPacienteClinica() {
        FabricaAbstrata fabrica = new FabricaClinica();
        Medico medico = new Medico(fabrica);
        assertEquals("Dados paciente Clinica", medico.emitirDadosPaciente());
    }

    @Test
    void deveEmitirPacienteHospital() {
        FabricaAbstrata fabrica = new FabricaHospital();
        Medico medico = new Medico(fabrica);
        assertEquals("Dados paciente Hospital", medico.emitirDadosPaciente());
    }
    @Test
    void deveEmitirItinerarioHospital() {
        FabricaAbstrata fabrica = new FabricaHospital();
        Medico medico = new Medico(fabrica);
        assertEquals("Itinerario Hospital", medico.emitirItinerario());
    }

    @Test
    void deveEmitirItinerarioClinica() {
        FabricaAbstrata fabrica = new FabricaClinica();
        Medico medico = new Medico(fabrica);
        assertEquals("Itinerario Clinica", medico.emitirItinerario());
    }
}