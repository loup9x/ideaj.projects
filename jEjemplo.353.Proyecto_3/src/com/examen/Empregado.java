package com.examen;

public class Empregado {
    // Declaración de los atributos de la clase
    private String Nome;
    private String sobreNome;
    private double salario;

    // Declaración del constructor
    public Empregado() {
        this.Nome = "";
        this.sobreNome = "";
        this.salario = 0;
    }

    // Declaración de los métodos set/get de los atributos
    // del objeto.
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getSobreNome() {
        return this.sobreNome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void aumentoSalario(double aumento) {
        if(0 < aumento && aumento <= 100)
            this.salario = this.salario + this.salario * aumento / 100;
    }
}
