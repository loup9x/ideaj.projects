package com.univdep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        // Declaración de las variables de entrada
        double side_a;
        double side_b;
        double side_c;

        // Declaración de las variables de salida
        double perimeter;
        double area;
        double semi;

        // Variables que han de servir para la entrada de datos por
        // parte del usuario.
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);

        System.out.println("      :: Sistema Triángulo :.");

        // Sección de entrada de datos por parte del usuario, a cada uno
        // de los lados del triángulo.
        do {
            try {
                System.out.print("      :: Lado [a] \\> ");
                String string = buffer.readLine();
                side_a = Double.parseDouble(string);
                break;
            } catch(NumberFormatException | IOException number) {
                System.err.println("""
                                   Error :: (0x00100) El valor ingresado no corresponde a un tipo
                                         :: numérico. Ingrese el valor solicitado.
                                   """);
            }
        } while (true);

        do {
            try {
                System.out.print("      :: Lado [b] \\> ");
                String string = buffer.readLine();
                side_b = Double.parseDouble(string);
                break;
            } catch(NumberFormatException | IOException number) {
                System.err.println("""
                                   Error :: (0x00101) El valor ingresado no corresponde a un tipo
                                         :: de dato numérico. Ingrese el valor solicitado.
                                   """);
            }
        } while (true);

        do {
            try {
                System.out.print("      :: Lado [c] \\> ");
                String string = buffer.readLine();
                side_c = Double.parseDouble(string);
                break;
            } catch(NumberFormatException | IOException number) {
                System.err.println("""
                                   Error :: (0x00102) El valor ingresado no corresponde a un tipo
                                         :: de dato numérico. Ingrese el valor solicitado.
                                   """);
            }
        } while (true);

        try {
            buffer.close();
            input.close();
        } catch (IOException e) {
            System.err.println("""
                               Error :: (0x00104) Ha ocurrido un error al momento de cerrar
                                     :: el ingreso de datos. Vuelva a ejecutar la aplicación
                                     :: nuevamente.
                               """);
            System.exit(0);
        }


        // Validar que los valores ingresaddos no sean menores o iguales
        // a cero.
        if(side_a > 0 && side_b > 0 && side_c > 0) {
            if( side_a + side_b >= side_c &&
                    side_a + side_c >= side_b &&
                    side_b + side_c >= side_a) {

                // Validando que tipo de tríángulo es el que se obtiene
                // con los valores ingresados.
                if(side_a == side_b && side_b == side_c)
                    System.out.println("""
                                             :: Triángulo [Equilatero]
                                       """);
                else if(side_a != side_b && side_b != side_c && side_a != side_c)
                    System.out.println("""
                                             :: Triángulo [Escaleno]
                                       """);
                else
                    System.out.println("""
                                             :: Triángulo [Isósceles]
                                       """);

                // Cálculo de los valores de salida
                perimeter = side_a + side_b + side_c;
                semi = perimeter / 2.0;
                area = semi * (semi - side_a) * (semi - side_b) * (semi - side_c);
                area = Math.sqrt(area);

                System.out.println("      :: Valores calculados :.");
                System.out.printf("      :: Perímetro \\> %.5f\n", perimeter);
                System.out.printf("      :: Área      \\> %.5f\n",  area);
            }
            else {
                System.err.println("""
                               Error :: (0x00104) Los valores ingresados no corresponden a
                                     :: a los lados de un triángulo. Verifique los datos
                                     :: y vuelva a ejecutar la aplicación.
                               """);
            }
        } else {
            System.err.println("""
                               Error :: (0x00103) Uno o más valores ingresados no pueden
                                     :: ser menores o iguales a cero. Vuelva a ejecutar
                                     :: el programa nuevamente para hacer el cálculo
                                     :: solicitado.
                               """);
        }


    }
}
