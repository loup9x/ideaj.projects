package com.univdep;

public class Main {

    public static void main(String[] args) {
        /*
        Declaración de las variables de entrada y salida.
        Sin asignación, significa que son variables
        independientes; y con asignación. signfica que son
        variables dependientes.
        Indepediente : Entrada.
        Dependiente : Salida
         */
        double x,
               y;

        double z = 0;

        // Entrada de datos.
        System.out.println("División de dos números ::");
        System.out.print("Ingresar del valor de [x]: ");
        x = (new java.util.Scanner(System.in)).nextDouble();
        System.out.print("Ingresar del valor de [y]: ");
        y = (new java.util.Scanner(System.in)).nextDouble();

        if(y != 0) {
            z = x / y;
            System.out.printf("Resultado: %.4f \n", z);
        }
    }
}
