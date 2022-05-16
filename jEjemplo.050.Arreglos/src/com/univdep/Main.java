package com.univdep;

public class Main {
    public static void main(String[] args) {
        // Formas de declarara arreglos en Java
        int[] A;
        A = new int[10];

        double []B = new double[10];

        int size = 10;
        String []C = new String[size];

        char []D = new char[] {'a', 'e', 'i', 'o', 'u'};

        // Impresión de la dirección de memoria en la que se aloja
        // la información del arreglo.
        System.out.println("Arreglo [A]: " + A.toString());
        System.out.println("Arreglo [B]: " + B.toString());
        System.out.println("Arreglo [C]: " + C.toString());
        System.out.println("Arreglo [D]: " + D.toString());

        for(int x: A)
            System.out.println(x);

        System.out.println(" :: ");

        for(int n = 0; n < B.length; n++)
            System.out.println(n + " :: " + B[n]);

        System.out.println(" :: ");

        int i = 0;
        while(i < size) {
            System.out.println(i + " :: " + (C[i] == null ? " - " : C[i]));
            i ++;
        }

        System.out.println(" :: ");

        i = 0;
        do {
            System.out.println(i + " :: " +  D[i]);
            i++;
        } while(i < D.length);

    }
}