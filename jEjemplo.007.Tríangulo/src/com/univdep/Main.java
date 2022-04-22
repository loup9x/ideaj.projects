package com.univdep;

public class Main {

    public static void main(String[] args) {
        // Declaración de las variables independientes.
        double lado_a = 8;
        double lado_b = 6;
        double lado_c = 9;

        // Declaración de las variables dependientes.
        double semiperimetro = 0;
        double perimetro = 0;
        double area = 0;

        System.out.println("Cálculo del área y perímetro de un triángulo.");
        System.out.println("Lado [a]: " + lado_a + "\n" +
                           "Lado [b]: " + lado_b + "\n" +
                           "lado [c]: " + lado_c);

        // Cálculo del perímetro de un triángulo.
        perimetro = lado_a + lado_b + lado_c;

        // Utilizando la formula de Heron, para calcular el
        // área de un triangulo, no importando el tipo de
        // figura.
        semiperimetro = perimetro / 2.0;
        area = semiperimetro * ( semiperimetro - lado_a ) *
                               ( semiperimetro - lado_b ) *
                               ( semiperimetro - lado_c );
        area = Math.sqrt(area);

        // Mostrando los resultados obtenidos.
        System.out.println("Perímetro: " + perimetro + "\n" +
                           "Semiperímetro: " + semiperimetro);

        // Forma de truncar el resultado en la presentación del
        // cálculo realizado.
        // %.4f -> Le indica al sistema que despues del punto decimal
        //         se deberá de desplegar sólo 4 decimales. La letra ´f´
        //         se utiliza para indicar que el valor obtenido esta
        //         en notación decimal.
        System.out.printf("Área: %.4f", area);
    }
}
