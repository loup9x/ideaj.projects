package com.univdep;

public class Main {
    public static void main(String[] args) {
        double p = 88.5; // Peso
        double e = 1.77; // Estatura
        double imc;

        System.out.println("Índice de masa corporal [IMC]");
        System.out.println("Peso: " + p);
        System.out.println("Estatura: " +  e);

        imc = p / Math.pow(e, 2);

        System.out.println("IMC: " + imc);
    }
}
