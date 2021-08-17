package com.company;

public class Medico {
    private String nome;
    private boolean plantonista;

    public Medico(String nome, boolean plantonista) {
        this.nome = nome;
        this.plantonista = plantonista;
    }

    public String getNome() {
        return nome;
    }

    public Medico setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public boolean isPlantonista() {
        return plantonista;
    }

    public Medico setPlantonista(boolean plantonista) {
        this.plantonista = plantonista;
        return this;
    }
}
