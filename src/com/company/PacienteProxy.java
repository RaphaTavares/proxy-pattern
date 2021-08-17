package com.company;

import java.util.List;

public class PacienteProxy implements IPaciente{

    private Paciente paciente;

    private Integer matricula;

    public PacienteProxy(Integer matricula) { this.matricula = matricula; }

    @Override
    public List<String> obterDadosPessoais(){
        if(this.paciente == null){
            this.paciente = new Paciente(this.matricula);
        }
        return this.paciente.obterDadosPessoais();
    }

    @Override
    public List<String> obterDiagnostico(Medico medico) throws IllegalAccessException {
        if(!medico.isPlantonista()){
            throw new IllegalAccessException("Médico não autorizado");
        }
        if(this.paciente == null){
            this.paciente = new Paciente(this.matricula);
        }
        return this.paciente.obterDiagnostico(medico);
    }

}
