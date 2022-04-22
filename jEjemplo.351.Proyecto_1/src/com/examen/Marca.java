package com.examen;

public class Marca {
    // Declaración de atributos
    String nome;
    int nrDeModelos;
    int ano_lancamento;
    String codigo_idenificador;

    // Declaración de métodos
    public Marca() {
        this.nome = "";
        this.nrDeModelos = 0;
        this.ano_lancamento = 0;
        this.codigo_idenificador = "";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNrDeModelos(int nrDeModelos) {
        this.nrDeModelos = nrDeModelos;
    }

    public int getNrDeModelos() {
        return this.nrDeModelos;
    }

    public void setAno_lancamento(int ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public int getAno_lancamento() {
        return this.ano_lancamento;
    }

    public void setCodigo_idenificador(String codigo_idenificador) {
        this.codigo_idenificador = codigo_idenificador;
    }

    public String getCodigo_idenificador() {
        return this.codigo_idenificador;
    }
}
