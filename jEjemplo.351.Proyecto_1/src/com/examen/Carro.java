package com.examen;

public class Carro {
    String Modelo;
    String Cor;
    int Ano;
    String Marca;
    String Chassi;
    Propietario propietario;
    int velocidade_max;
    int velocidade_atual;
    int numero_portas;
    boolean teto_solar;
    int numero_marchas;
    boolean automaico;
    int nivel_combustible;

    public Carro(Propietario propietario) {
        this.Modelo = "";
        this.Cor =  "";
        this.Ano = 0;
        this.Marca = "";
        this.Chassi = "";
        this.propietario = propietario;
        this.velocidade_max = 0;
        this.velocidade_atual = 0;
        this.numero_portas = 0;
        this.teto_solar = false;
        this.numero_marchas = 0;
        this.automaico = false;
        this.nivel_combustible = 0;
    }

    public void aumentaVelocidade() {
        this.velocidade_atual++;
    }

    public void freina() {
        if(this.velocidade_atual > 0)
            this.velocidade_atual --;
    }

    public void troca_marcha() {
        this.numero_marchas ++;
    }

    public void reduz_marcha() {
        if(this.numero_marchas > 0)
            this.numero_marchas --;
    }

    public double autonomia_viagem(int consumo) {
        return 0;
    }

    public void volumeCombustivel() {
        System.out.println(this.nivel_combustible);
    }

}
