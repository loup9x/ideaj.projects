package com.univdep;

public class Main {

    public static void main(String[] args) {
        // Declaración de las variables de entrada (Independientes).
        double a = 1;
        double b = -1;
        double c = 7;

        // Declaración de la variable de apoyo.
        double temp = 0;

        // Declaración de las variables de salida (Dependientes)
        double x1 = 0;
        double x2 = 0;

        // Realizando las operaciones que son comunes para los
        // dos posibles resultados.
        temp = ( b * b ) ;
        temp = temp - ( 4 * a * c );

        // Calculando los resultados de x1 y de x2, con el apoyo
        // de la variable de apoyo.
        x1 = ( -b + Math.sqrt( temp )) / ( 2 * a );
        x2 = ( -b - Math.sqrt( temp )) / ( 2 * a );


        // Imprimiendo los valores ingresados.
        System. out.println("Formula general P/ Ecs. Cuadráticas");
        System.out.println("Valor de [a]: " + a);
        System.out.println("Valor de [b]: " + b);
        System.out.println("Valor de [c]: " + c);

        // Mostrando los resultados obtenidos.
        System.out.printf("Valor de [x1]: %.5f", x1);
        System.out.println();
        System.out.printf("Valor de [x2]: %.5f", x2);
    }
}
