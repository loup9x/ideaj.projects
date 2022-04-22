package com.univdep;

public class Main {
    public static void main(String[] args) {
	    // Declaración de variables
        double p,   // Peso
               e;   // Estatura
        double imc; // Indice de masa corporal

        // Entrada de datos
        System.out.println("Sistema que Indice de Masa Corporal ::");
        System.out.print("Ingrese su estatura [mts]: ");
        e = (new java.util.Scanner(System.in)).nextDouble();

        // Validando el valor ingresado con las condiciones de límite
        // aceptado para el cálculo del índice.
        if(1.0 <= e && e <= 2.30) {
            System.out.print("Ingrese su peso [kgs]: ");
            p = (new java.util.Scanner(System.in)).nextDouble();

            // Validando el valor ingresado con las condiciones de límite
            // aceptado para el cálculo del índice.
            if(50 <= p && p <= 150) {
                // Obteniendo el indice
                imc = p / Math.pow(e, 2.0);

                // Comparando el valor del índice con los diferentes límites
                // y así indicar que tipo de índice tiene.
                System.out.printf(":: Indice: %.4f \n", imc);
                if(imc < 18.5)
                    System.out.println(":: Bajo peso");
                else if(18.5 <= imc && imc < 24.9)
                    System.out.println(":: Peso normal");
                else if(24.9 <= imc && imc < 29.9)
                    System.out.println(":: Sobre peso");
                else
                    System.out.println(":: Obesidad");
            }
            else {
                System.out.println("Error :: El peso ingresado esta " +
                                   "fuera del rango solicitado.");
            }
        } else {
            System.out.println("Error :: La estatura ingresada esta " +
                               "fuera del rango solicitado.");
        }
    }
}
