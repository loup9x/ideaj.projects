package com.univdep;

public class Main {
    public static void main(String[] args) {
        // Declaración de variables
        double valor;
        double x = 32;
        int y = 2;

        // Ilustrando los valores de operación
        System.out.println("Valores de operación. \n" +
                           "[x]: " + x + "\n" +
                           "[y]: " + y + "\n");
        // Suma
        valor = x + y;
        System.out.println("Suma [x + y]: " + valor);

        // Substracción
        valor = x - y;
        System.out.println("Substracción [x - y]: " + valor);

        // Producto
        valor = x * y;
        System.out.println("Producto [x * y]: " + valor);

        // División
        valor = x / y;
        System.out.println("División [x / y]: " + valor);

        // Módulo & Residuo
        valor = x % y;
        System.out.println("Residuo [x % y]: " + valor);

        valor = Math.pow(x, y);
        System.out.println("Potencia [x ^ y]: " + valor);
    }
}
