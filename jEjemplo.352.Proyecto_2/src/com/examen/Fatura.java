package com.examen;

public class Fatura {
    private int numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura() {
        this.numero = 0;
        this.descricao = "";
        this.quantidade = 0;
        this.preco = 0;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setPreco(double preco) {
        if(preco >= 0)
            this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

    public double getTotalFatura() {
        return this.getPreco() * this.quantidade;
    }
}