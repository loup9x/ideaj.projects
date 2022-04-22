package com.univdep;

public class Main {

    public static void main(String[] args) {
        // Declaración de variables
        double factorial = 1;   // Variable tipo acumulador
        byte tope = 1;          // Variable tipo bandera
        int contador = 155;     // Variable tipo contador

        // Mostrando el valor de operación (contador)
        System.out.println("Número: " + contador);

        // Se realizarán las iteraciones necesarias, hasta que
        // el valor del contador alcance el valor del tope
        while(contador >= tope) {
            // Se realiza el producto del contador con el factorial,
            // y se actualizará el valor del factorial.
            factorial = factorial * contador;

            // Se decrementa en uno el valor del contador.
            contador = contador - 1;
        }

        System.out.println("Resultado: " + factorial);
    }
}
