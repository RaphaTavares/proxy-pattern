package com.company.tests;

import com.company.BD;
import com.company.Medico;
import com.company.Paciente;
import com.company.PacienteProxy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class PacienteProxyTest {

    @BeforeEach
    public void setUp(){
        BD.addPaciente(new Paciente("Raphael", 2018001585, "Síndrome do olho seco" ));
        BD.addPaciente(new Paciente("Marco", 0000000002, "Saudável" ));
    }

    @Test
    public void deveRetornarDadosPessoaisPaciente(){
        PacienteProxy paciente = new PacienteProxy(2018001585);

        assertEquals(Arrays.asList("Raphael"), paciente.obterDadosPessoais());
    }

    @Test
    public void deveRetornarDiagnosticosPaciente() throws IllegalAccessException {
        Medico medico = new Medico("Doutor Fulano", true);
        PacienteProxy paciente = new PacienteProxy(2018001585);

        assertEquals(Arrays.asList("Síndrome do olho seco"), paciente.obterDiagnostico(medico));
    }

    @Test
    public void deveRetornarExcessaoMedicoNaoAutorizado() throws IllegalAccessException {
        try {
            Medico medico = new Medico("Doutor Fulano", false);
            PacienteProxy paciente = new PacienteProxy(2018001585);

            paciente.obterDiagnostico(medico);
            fail();
        }
        catch(IllegalAccessException e){
            assertEquals("Médico não autorizado", e.getMessage());
        }
    }
}
