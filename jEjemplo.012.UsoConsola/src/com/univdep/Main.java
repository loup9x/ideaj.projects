package com.univdep;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String dato;
        double lado = 0;
        double area = 0;

        System.out.println("Cálculo del área de un cuadrado.");

        // Ingreso del valor al sistema.
        System.out.print("Lado del cuadrado: ");
        dato = System.console().readLine();

        // Conversion del texto ingresado a un valor numérico.
        lado = Double.parseDouble(dato);

        // Cálculo del área.
        area = Math.pow(lado, 2);

        // Mostrando el resultado obtenido.
        System.out.println("Área del cuadrado: " + area);
    }
}
