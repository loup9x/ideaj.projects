package com.univdep;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Declaración de variables
        int tope = 100;     // Variable de tipo bandera
        int derecha = 0;    // Variable de tipo acumulador
        int izquierda = 0;  // Variable de tipo acumulador
        int centro = 0;     // Variable de tipo acumulador

        int n = 0;          // Variable de tipo contador

        // Generador de números aleatorios.
        Random R = new Random();
        // Alimentando al generador con una semilla continua
        // y de gran valor
        R.setSeed(System.currentTimeMillis());

        System.out.println("Sistema que genera posiciones al azar ::");

        // Mientras el contador este ppor debajo del limite,
        // se ejecutará el ciclo.
        while(n < tope) {
            // Obtención del número aleatorio
            double value = R.nextDouble();

            // Etapa de comparaciones
            if(value < 0.333333) {
                derecha = derecha + 1;
                System.out.println((n + 1) + "\tDerecha");
            }
            else if(0.333333 <= value && value < 0.666666) {
                centro = centro + 1;
                System.out.println((n + 1) + "\tCentro");
            } else {
                izquierda = izquierda + 1;
                System.out.println((n + 1) + "\tIzquierda");
            }
            n = n + 1;
        }

        // Salida de resultados
        System.out.println("\n:: Resultados obtenidos :.");
        System.out.println("Derecha:   " + derecha + "\n" +
                           "Centro:    " +  centro + "\n" +
                           "Izquierda: " + izquierda);
    }
}
