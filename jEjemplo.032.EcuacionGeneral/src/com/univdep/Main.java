package com.univdep;
public class Main {

    public static double comunValue(double a, double b, double c) {
        double temp;
        temp = Math.pow(b, 2) - 4 * a * c;
        return temp;
    }

    public static void valueX1(double a, double b, double comun) {
        double x = (-b + comun) / (2 * a);
        System.out.println("      :: Valor [x1]: " + x);
    }

    public static void valueX2(double a, double b, double comun) {
        double x = (-b + comun) / (2 * a);
        System.out.println("      :: Valor [x2]: " + x);
    }

    public static void main(String[] args) {
        double a = 1;
        double b = -4;
        double c = 4;

        double comun;

        System.out.println("      :: Ecuacion General de 2do Grado");
        System.out.println();
        comun = comunValue(a, b, c);
        if(comun < 0) {
            System.out.println("Error :: Los valores que se designaron para este problema no ofrecen solución.");
        }
        else {
            comun = Math.sqrt(comun);
            if(a != 0) {
                valueX1(a, b, comun);
                valueX2(a, b, comun);
            } else {
                System.out.println("Error :: El valor de [a] para este problema no ofrecen solución.");
            }
        }
    }
}