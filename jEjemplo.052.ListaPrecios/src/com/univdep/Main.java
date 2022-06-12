package com.univdep;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String []args) {
        // Declaración de variables.
        int size = 0;
        int []CN;
        String []CP;
        double []PU;

        // Declaración de las variables de apoyo.
        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader B = new BufferedReader(I);

        // Se solicita el tamaño de la lista de precios.
        try {
            System.out.print("      :: Tamaño de la lista de precios: ");
            String str = B.readLine();
            size = Integer.parseInt(str);
        } catch(Exception ex) {
            System.err.println("Error :: (0x00A001) Valor no permitido por el sistema.");
            System.exit(0);
        }

        if(0 < size && size < Integer.MAX_VALUE) {
            CN = new int[size];
            CP = new String[size];
            PU = new double[size];
            for(int n = 0; n < size; n++) {

                // Solicitud de la cantidad de producto a almacenar.
                try {
                    System.out.print("      :: Cantidad:");
                    String str = B.readLine();
                    int value = Integer.parseInt(str);
                    if(value > 0)
                        CN[n] = value;
                    else {
                        System.err.println("Error :: Valor fuera del rango permitido por el sistema \n" +
                                           "      :: para las cantidades de los productos.");
                        System.exit(0);
                    }
                } catch(Exception ex) {
                    System.err.println("Error :: (0x00A002) Valor no permitido por el sistema.");
                    System.exit(0);
                }

                // Solicitud del concepto de producto a almacenar.
                try {
                    System.out.print("      :: Concepto: ");
                    String str = B.readLine();
                    if(!str.isBlank())
                        CP[n] = str;
                    else {
                        System.err.println("Error :: No hay ingresado concepto, y esto no esta \n" +
                                           "      :: permitido por el sistema.");
                        System.exit(0);
                    }
                } catch(Exception ex) {
                    System.err.println("Error :: (0x00A003) Valor no permitido por el sistema.");
                    System.exit(0);
                }

                // Solicitud del precio unitario del producto a almacenar.
                try {
                    System.out.print("      :: Precio unitario: ");
                    String str = B.readLine();
                    double value = Double.parseDouble(str);
                    if(value > 0)
                        PU[n] = value;
                    else {
                        System.err.println("Error :: Valor fuera del rango permitido por el sistema \n" +
                                           "      :: para los precios unitarios de los productos.");
                        System.exit(0);
                    }
                } catch(Exception ex) {
                    System.err.println("Error :: (0x00A002) Valor no permitido por el sistema.");
                    System.exit(0);
                }
            }

            // Sección en donde se muestra el contenido almacenado en los diversos arreglos.
            System.out.print("""
                             \n
                                   :: Lista de precios
                             Cantidad       Concepto        P Unitario
                             """);

            for(int n = 0; n < size; n++) {
                StringBuilder str = new StringBuilder((CN[n]) + "");
                if(str.length() < 10)
                    str.append(" ".repeat(Math.max(0, (Math.abs(str.length() - 15)))));
                System.out.print(str);

                str = new StringBuilder((CP[n]) + "");
                if(str.length() < 25)
                    str.append(" ".repeat(Math.max(0, (Math.abs(str.length() - 16)))));
                System.out.print(str);

                System.out.println(PU[n]);
            }
        }
        else {
            System.err.println("Error :: Valor fuera del rango permitido por el sistema.");
        }

        try {
            B.close();
            I.close();
        } catch(Exception ex) {
            System.err.println("Error :: El sistema tiene problemas para cerrar el sistema." +
                               "      :: Revise posibles causas de falla.");
        }
    }
}
