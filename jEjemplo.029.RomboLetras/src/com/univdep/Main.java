package com.univdep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        int tope;           // bandera
        boolean salir;  // bandera
        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader B = new BufferedReader(I);
        int letra = 97;       // acumulador

        System.out.print("""
                               ::
                               :: Sistema Generador de Figuras
                               ::
                         """);
        do {

            try {
                System.out.print("      :: Tamaño de la figura \\> ");
                String str = B.readLine();
                tope = Integer.parseInt(str);
            } catch (IOException | NumberFormatException ex) {
                System.err.print("""
                                       ::
                                 Error :: Se ha ingresado un valor que no corresponde
                                       :: al solicitado.
                                 """);
                tope = 0;
            }

            System.out.print("""
                                   ::
                                   ::
                                   ::
                                   
                             """);

            if (tope > 0) {
                // Dibujar la primera parte del rombo
                int m = tope - 1;
                for (int n = 1; n <= tope; n++) {
                    // Pintando espacios en blanco
                    while (m > 0) {
                        System.out.print(" ");
                        m--;
                    }
                    m = tope - (n + 1);
                    for (int k = 1; k <= n; k++) {
                        System.out.print((char) letra + " ");
                        letra++;
                        if (letra == 122) // Si letra es igual a 'z'
                        {
                            letra = 97;  // letra es igual a 'a'
                        }
                    }
                    System.out.println();
                }

                // Dibujar la primera parte del rombo
                m = 1;
                int flag = 1;
                for (int n = tope - 1; n >= 1 ; n--) {
                    // Pintando espacios en blanco
                    while (m <= flag) {
                        System.out.print(" ");
                        m++;
                    }
                    m = 1;
                    flag++;
                    for (int k = 1; k <= n; k++) {
                        System.out.print((char) letra + " ");
                        letra++;
                        if (letra == 122) // Si letra es igual a 'z'
                        {
                            letra = 97;  // letra es igual a 'a'
                        }
                    }
                    System.out.println();
                }

                System.out.print("""
                                       
                                       ::
                                       ::
                                       ::
                                 """);
                letra = 97;
            } else {
                System.err.print("""
                                       ::
                                 Error :: El valor ingresado no puede ser igual o menor
                                       :: a cero.
                                 """);
            }

            try {
                System.out.print("      :: ¿Desea salir [Si: true | No: false] \\> ");
                String str = B.readLine();
                salir = Boolean.parseBoolean(str);
            } catch (IOException ex) {
                System.err.print("""
                                       ::
                                 Error :: Se ha ingresado un valor que no corresponde
                                       :: al solicitado.
                                 """);
                salir = false;
            }

        } while (!salir);

        try {
            B.close();
            I.close();
        } catch (IOException ex) {
            System.err.print("""
                                       ::
                                 Error :: El cierre de la lectura de datos presenta un
                                       :: problema no identificado. Revisar más tarde.
                                 """);
        }
    }
}
