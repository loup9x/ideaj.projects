package com.univdep;
public class Main {
    public static void main(String[] args) {
        // Declaración de variables y de constantes
        final int uno = -1;     // Constante
        double x;               // Contador
        double factorial = 1;   // Acumulador del producto
        double suma = 0;        // Acumulador de la suma

        // Lectura del valor (ángulo) a convertir
        System.out.print("ángulo [0~360]: ");
        x = (new java.util.Scanner(System.in)).nextDouble();

        // Si el ángulo esta en el rango de 0 hasta 359. Se
        // procede a realizar el cálculo.
        if(0 <= x && x < 360) {
            x = Math.toRadians(x);   // Convertisión del valor decimal a radian.

            // Ciclo que ha de calcular el factorial.
            for(int n = 0; n < 15; n++) {
                if(n > 0) {
                    // Ciclo que cálcula el valor del factorial en forma impar
                    for(int m = 1; m <= (2*n + 1); m++)
                        factorial *= m;
                }

                // Se realiza la sumatoria de los valores impares,
                // cómo se indica en la serie de Taylor.
                suma += (Math.pow(uno, n) * Math.pow(x, 2*n + 1)) / factorial;
                factorial = 1;
            }

            // Se presenta el valor del seno con base al
            // ángulo ingresado por el usuario.
            System.out.printf("Seno[%.2f] = %.8f", Math.toDegrees(x), suma);
        }
    }
}
