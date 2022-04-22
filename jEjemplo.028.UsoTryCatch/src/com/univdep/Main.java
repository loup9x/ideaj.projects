package com.univdep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	    // Declaración de las variables de operación
        double value = 0;
        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader B = new BufferedReader(I);

        // Lectura del valor a procesar
        try {
            System.out.print("      :: Ingresar el valor a procesar \\> ");
            String data = B.readLine();
            // Conversión del valor en formato de cadena a número
            value = Double.parseDouble(data);
        } catch (NumberFormatException | IOException ex) {
            System.err.print(
                    """
                    Error :: El valor ingresado no es un número válido para el sistema.
                          :: Reinicie el sistema, y vuelva a ingresar un dato al sistema.
                    """);
            System.exit(0);
        }

        if(value >= 0) {
            System.out.print(
                    """
                          ::
                          :: El  resultado es: 
                    """ + value +
                    """
                          ::
                    """
            );
        } else {
            System.err.print(
                    """
                          ::
                    Error :: El valor ingresado no puede ser menor a cero.
                          ::
                    """);
        }

        try {
            B.close();
            I.close();
        } catch (IOException ex) {
            System.err.print(
                    """
                    Error :: Ha ocurrido una falla en el sistema, y no pudo cerrar de forma
                          :: adecuada el sistema. Revise más tarde si la aplicación funciona
                          :: correctamente.
                    """);
        }

    }
}
