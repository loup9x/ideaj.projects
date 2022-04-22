package com.univdep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // Habilitando el uso del teclado.
        InputStreamReader iReader = new InputStreamReader(System.in);
        // Habilitando la entrada de datos, a través del teclado.
        BufferedReader bReader = new BufferedReader(iReader);

        // Declaración de variables
        double m = 0,   // Variable de salida
               e = 0,   // Variable de entrada :: Estatura
               p = 0;   // Variable de entrada :: Peso

        // Entrada de datos
        System.out.println("Cálculo del indice de masa corporal.");
        System.out.print("Ingresar peso: ");
        String str = bReader.readLine();

        // Conversión del texto a valor numérico.
        p = Double.parseDouble(str);

        // Entrada de datos, y conversión del texto a
        // valor numérico.
        System.out.print("Ingresar estatura: ");
        e = Double.parseDouble(bReader.readLine());

        // Cerrando el uso del teclado y del bus de datos.
        bReader.close();
        iReader.close();

        // Cálculo del índice de masa corporal.
        m = p / (e * e);

        // Mostrando datos ingresados, y el resultado
        // obtenido.
        System.out.println("\tPeso: " + p + "\n" +
                           "\tEstatura: " + e );
        System.out.printf("\tMasa corporal: %.3f", m);
    }
}
