package com.univdep;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        boolean salir = false;

        do {
            System.out.println(":: Serie de Taylor ::\n");
            System.out.println("[1] Función Seno");
            System.out.println("[2] Función Coseno");
            System.out.println("[3] Salir \n");
            System.out.print("\tSu opción es: \t");

            int opcion = S.nextInt();

            switch(opcion) {
                case 1 -> {
                    final int uno = -1;
                    System.out.print("\tángulo [0~360]: ");
                    double degree = S.nextDouble();
                    if(0 <= degree && degree < 360) {
                        double radian = Math.toRadians(degree);  // degree * Math.PI / 180;
                        double factorial;
                        double suma = 0;

                        for(int n = 0; n <= 15; n++) {  // n = n + 1;
                            factorial = 1;
                            for(int m = 1; m <= (2 * n +  1); m++) {  // m = m + 1;
                                factorial *= m;  // factorial = factorial * m;
                            }
                            suma += (Math.pow(uno, n) * Math.pow(radian, 2 * n + 1) / factorial );
                        }
                        System.out.printf("\tAngulo[%.0f] en Seno = %.5f.\n\n", degree, suma);
                    }
                    else
                        System.out.println("Error :: El valor ingresado esta fuera del rango de operación.");
                }
                case 2 -> {
                    final int uno = -1;
                    System.out.print("\tángulo [0~360]: ");
                    double degree = S.nextDouble();
                    if(0 <= degree && degree < 360) {
                        double radian = Math.toRadians(degree);  // degree * Math.PI / 180;
                        double factorial;
                        double suma = 0;

                        for(int n = 0; n <= 15; n++) {  // n = n + 1;
                            factorial = 1;
                            for(int m = 1; m <= (2 * n); m++) {  // m = m + 1;
                                factorial *= m;  // factorial = factorial * m;
                            }
                            suma += (Math.pow(uno, n) * Math.pow(radian, 2 * n) / factorial );
                        }
                        System.out.printf("\tAngulo[%.0f] en Coseno = %.5f.\n\n", degree, suma);
                    }
                    else
                        System.out.println("Error :: El valor ingresado esta fuera del rango de operación.");
                }

                case 3 -> {
                    System.out.println("\t Adios!!!");
                    salir = true;
                }

                default -> System.out.println("Error :: Opción invalida.");
            }

        } while (!salir);

        S.close();
    }
}
