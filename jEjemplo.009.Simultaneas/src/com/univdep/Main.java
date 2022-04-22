package com.univdep;

public class Main {

    public static void main(String[] args) {
	    double a = 2, b = 5, c = 15;
        double d = 3, e = 3, f = 18;

        double x = 0, y = 0;

        System.out.println("Sistema de ecuaciones simúltaneas.");
        // Mostrando las las ecuaciones
        System.out.println(a + "x + " + b + "y = " + c);
        System.out.println(d + "x + " + e + "y = " + f);

        // Solución para [y]
        y = (a * f - d * c) / (a * e - d * b);

        // solución para [x]
        x = (c - b * y) / a;

        // Mostrando resultados
        System.out.println("Solución para [x]: " + x + "\n" +
                           "Solución para [y]: " + y);

    }
}
