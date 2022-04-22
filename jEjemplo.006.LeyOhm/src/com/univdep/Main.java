package com.univdep;

public class Main {
    public static void main(String[] args) {
        // Declaración de variables.
        double volt = 127;
        double ampere = 1.5;
        double ohm = 2700;

        double resultado;

        System.out.println("Demostración de la ley de Ohm");
        System.out.println("Voltaje: " + volt + "\n" +
                           "Corriente: " + ampere + "\n" +
                           "Resistencia: " + ohm);

        // Cálculo del voltaje, usando la corriente y la resistencia.
        resultado = ampere * ohm;
        System.out.println("Voltaje: " + resultado);

        // Cálculo de la resistencia, usando el voltaje y la corriente.
        resultado = volt / ampere;
        System.out.println("Resistencia: " + resultado);

        // Cálculo de la corriente, usando el voltaje y la resistencia.
        resultado = volt / ohm;
        System.out.println("Corriente: " + resultado);
    }
}
