package com.company;

import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Paciente> pacientes = new HashMap<>();

    public static Paciente getPaciente(Integer matricula){
        return pacientes.get(matricula);
    }

    public static void addPaciente(Paciente paciente){
        pacientes.put(paciente.getMatricula(), paciente);
    }
}
