package com.company;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Paciente implements IPaciente{
    private String nome;
    private Integer matricula;
    private String diagnostico;

    public Paciente(Integer matricula){
        this.matricula = matricula;
        Paciente objeto = BD.getPaciente(matricula);
        this.nome = objeto.nome;
        this.diagnostico = objeto.diagnostico;
    }

    public Paciente(String nome, Integer matricula, String diagnostico) {
        this.nome = nome;
        this.matricula = matricula;
        this.diagnostico = diagnostico;
    }

    public String getNome() {
        return nome;
    }

    public Paciente setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public Paciente setMatricula(Integer matricula) {
        this.matricula = matricula;
        return this;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public Paciente setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
        return this;
    }

    @Override
    public List<String> obterDadosPessoais() {
        return Arrays.asList(this.nome);
    }

    public List<String> obterDiagnostico(Medico medico){
        return Arrays.asList(this.diagnostico);
    }

}
