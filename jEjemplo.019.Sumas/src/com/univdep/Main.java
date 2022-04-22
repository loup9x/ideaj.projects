package com.univdep;

public class Main {

    public static void main(String[] args) {
        // Declaración de variables.
        int tope = 10;      // variable tipo bandera
        int contador = 0;   // variable tipo contador
        int suma = 0;       // variable tipo acumulador

        // Mientras que el contador sea menor al valor de tope,
        // se realizarán las iteraciones requeridas.
        while(contador < tope) {
            // Se realiza la suma con el contador, y se actualiza el valor de
            // suma en cada iteración. Hasta llegar al valor de tope - 1
            suma = suma +  contador;
            // Se muestra lo que se tiene acumulado en la variable suma
            // y número del proceso que se encuentra en la variable contador
            System.out.println("Suma :: \t" + suma +
                               "\t Contador :: " + contador);
            // Se va incrementando el contador en uno
            contador = contador +  1;
        }
    }
}
