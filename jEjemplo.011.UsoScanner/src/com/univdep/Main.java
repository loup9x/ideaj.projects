package com.univdep;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // Habilitando la entrada de datos con el uso de este objeto.
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        double radio;
        double area = 0;

        System.out.println("Cálculo del área de un circulo.");

        // Entrada de datos al sistema
        System.out.print("Ingresar el valor del radio: ");
        radio = scanner.nextDouble();

        // Proceso de transformación.
        area =Math.PI * Math.pow(radio, 2);

        // Mostrando el resultado obtenido.
        System.out.printf("Área del círculo: %.4f \n", area);

        // Cerrando el uso del teclado.
        scanner.close();
    }
}
