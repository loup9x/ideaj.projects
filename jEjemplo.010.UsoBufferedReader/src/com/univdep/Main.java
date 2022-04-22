package com.univdep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // Activación del teclado para su posterior uso. Primero se
        // invoca las rutinas de entrada, y posteriormente, la lectura
        // de los datos.
        InputStreamReader ireader = new InputStreamReader(System.in);
        BufferedReader breader = new BufferedReader(ireader);

        // Declaración de variables para el sistema.
        String nombre;
        int edad;

        // Se lee el nombre, y cómo el buffer solo lee caracteres.
        System.out.print("Nombre: ");
        nombre = breader.readLine();

        // Se lee la edad, pero cómo se lee en texto, debe de convertir
        // a traves del Wrapper de números enteros.
        System.out.print("Edad: ");
        edad = Integer.parseInt(breader.readLine());

        // Se muestran los valores ingresados.
        System.out.println("\nValores ingresados:");
        System.out.println("Nombre: " + nombre + "\n" +
                "Edad: " + edad);

        // Se cierra el uso del teclado.Pedro
        breader.close();
        ireader.close();
    }
}
