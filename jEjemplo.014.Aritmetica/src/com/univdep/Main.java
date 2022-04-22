package com.univdep;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    double w,
               x,
               y,
               z;

        double a = 0,
               b = 0,
               c = 0;

        double alfa = 0,
               beta = 0,
               gamma = 0;

        Scanner S = new Scanner(System.in);

        System.out.println("Sistema basado en un modelo aritmético");
        System.out.print("Valor de [w]: ");
        w = S.nextDouble();

        System.out.print("Valor de [x]: ");
        x = S.nextDouble();

        System.out.print("Valor de [y]: ");
        y = S.nextDouble();

        System.out.print("Valor de [z]: ");
        z = S.nextDouble();

        a = (3 * x) / (4. * z) + (5. * w) / (7 * y) - (2 * y) / (3 * z);
        b = (2 * w) / (3. * x) + (7. * y) / (11 * x) - (3. * z) / (5 * x);
        c = (4 * y) / (5. * w) + (9. * x) / (13 * w) - (4. * x) / (7 * w);

        alfa = Math.toRadians( Math.atan(a / (b + c)) );
        beta = Math.toRadians( Math.atan(b / (a + c)) );
        gamma = Math.toRadians( Math.atan(c / (a + b)) );

        
    }
}
