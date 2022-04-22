package com.univdep;

public class Main {
    public static void main(String[] args) {
        // Imprimiendo resultados de operaciones
        // aritméticas en las sentencias: print y
        // println.
        System.out.print("Primera operación: " +
                         "5+6/9-1*4+6-20%4" +
                         "\n");
        System.out.print("Resultado: " +
                         (5+6/9-1*4+6-20%4) +
                         "\n");

        System.out.print("Segunda operación: " +
                         "5+6/9.-1*4+6-20%4" +
                         "\n");
        System.out.print("Resultado: " +
                         (5+6/9.-1*4+6-20%4) +
                         "\n");

        System.out.print("Tercera operación: " +
                         "5+6./9-1*4+6-20%4" +
                         "\n");
        System.out.print("Resultado: " +
                         (5+6./9-1*4+6-20%4) +
                         "\n");
    }
}
