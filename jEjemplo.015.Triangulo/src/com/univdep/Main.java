package com.univdep;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declaración de las variables
	    double lado_a,
               lado_b,
               lado_c;

        double a = 0,   // Área
               p = 0 ,   // Perímetro
               s = 0;   // Semiperímetro

        Scanner S = new Scanner(System.in); // Habilitación del teclado

        // Entrada de datos
        System.out.println("Cálculos de la figura del Triángulo.");
        System.out.print("Ingresar el valor del lado [a]: ");
        lado_a = S.nextDouble();
        System.out.print("Ingresar el valor del lado [b]: ");
        lado_b = S.nextDouble();
        System.out.print("Ingresar el valor del lado [c]: ");
        lado_c = S.nextDouble();
        S.close();  // Cerrando el teclado.

        // Cálculo del perímetro, semiperímetro y del área.
        p = lado_a + lado_b + lado_c;
        s =  p / 2.0;
        a = s * (s - lado_a) * (s - lado_b) * (s - lado_c);
        a = Math.sqrt(a);

        // Presentación de los resultados obtenidos.
        System.out.println("Lado [a]: " + lado_a + "\n" +
                           "Lado [b]: " + lado_b + "\n" +
                           "Lado [c]: " + lado_c + "\n" +
                           "Resultados :: \n" +
                           "Perímetro: " + p + "\n" +
                           "Área: " + a);
    }
}
