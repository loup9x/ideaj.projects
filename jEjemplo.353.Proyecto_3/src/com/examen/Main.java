package com.examen;

public class Main {

    public static void main(String[] args) {
        Empregado A = new Empregado();
        Empregado B = new Empregado();

        A.setNome("Pedro");
        A.setSobreNome("Godinez");
        A.setSalario(4500);

        B.setNome("Pablo");
        B.setSobreNome("Gutierritos");
        B.setSalario(4750);

        System.out.println("Empregado \t Sobrenome \t\t Salario");
        System.out.println(":." + A.getNome() + "\t\t " + A.getSobreNome() + "\t\t $ " + A.getSalario() +"\n"+
                           ":." + B.getNome() + "\t\t " + B.getSobreNome() + "\t $ " + B.getSalario());
    }
}
