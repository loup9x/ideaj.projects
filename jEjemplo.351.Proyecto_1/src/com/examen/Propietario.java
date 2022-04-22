package com.examen;

import java.util.Date;

public class Propietario extends Endereco {
    // Declaración de los atributos del objeto
    private String nome;
    String CPF;
    String RG;
    private Date data_nascimiento;

    // Declaración del constructor.
    public Propietario (String nome, String CPF, String RG){
        super();

        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;

        this.data_nascimiento = new Date();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setData_nascimiento(Date data_nascimiento) {
        this.data_nascimiento = data_nascimiento;
    }

    public Date getData_nascimiento() {
        return this.data_nascimiento;
    }
}
