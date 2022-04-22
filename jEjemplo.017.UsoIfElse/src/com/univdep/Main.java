package com.univdep;

public class Main {
    public static void main(String[] args) {
	    // Declaración de variables
        double x,
               y;

        boolean option; // Variable tipo bandera

        double resultado;   // Variable de salida

        // Entrada de datos
        System.out.println("Toma de decisiones ::");
        System.out.print("Valor [x]= ");
        x = (new java.util.Scanner(System.in)).nextDouble();
        System.out.print("Valor [y]= ");
        y = (new java.util.Scanner(System.in)).nextDouble();

        // Selección del tipo de operación a realizar
        System.out.print("[true] x - y | [false] y - x: ");
        option = (new java.util.Scanner(System.in)).nextBoolean();

        // Toma de decisiones con dos opciones
        if(option)
            resultado = x - y;
        else
            resultado = y - x;

        // Mostrando resultados
        System.out.println("Resultado: " +  resultado);
    }
}
