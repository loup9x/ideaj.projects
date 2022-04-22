package com.examen;

public class Endereco {
    private String Rua;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private String Cep;
    private String Complemento;

    public Endereco() {
        this.Rua = "";
        this.Bairro = "";
        this.Cidade = "";
        this.Estado = "";
        this.Cep = "";
        this.Complemento = "";
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getRua() {
        return this.Rua;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getBairro() {
        return this.Bairro;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getCidade() {
        return this.Cidade;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public String getCep() {
        return this.Cep;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getEstado() {
        return this.Estado;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getComplemento() {
        return this.Complemento;
    }
}
