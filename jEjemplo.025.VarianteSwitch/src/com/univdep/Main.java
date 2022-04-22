package com.univdep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	    char opcion;
        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader B = new BufferedReader(I);
        boolean paso = false;

        do {
            System.out.println("Opciones\n");
            System.out.println("[A] Mensaje de bienvenida");
            System.out.println("[B] Mensaje de salida");
            System.out.println("[C] Salir \n");
            System.out.print("\tSu opción es:");

            opcion = (char) B.read();

            switch (opcion) {
                case 'A', 'a' -> System.out.println("Opción [A] seleccionada.");

                case 'B', 'b' -> System.out.println("Opción [B] seleccionada");

                case 'C', 'c' -> {
                    System.out.println("Adios!!!");
                    paso = true;
                }
                default -> System.out.println("Opción invalida.");
            }

            /*
            switch(opcion) {
                case 'A':
                case 'a':
                    System.out.println();
                    break;
                case 'B':
                case 'b':
                    System.out.println();
                    break;
                case 'C':
                case 'c':
                    System.out.println();
                    paso = true;
                    break;
                default:
                    System.out.println();
             */
        } while(!paso);

        B.close();
        I.close();
    }
}
