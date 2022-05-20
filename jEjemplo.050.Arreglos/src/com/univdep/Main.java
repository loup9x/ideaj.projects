package com.univdep;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Formas de declarar arreglos en Java
        int[] A;
        A = new int[10];

        double []B = new double[10];

        int size = 10;
        String []C = new String[size];

        char []D = new char[] {'a', 'e', 'i', 'o', 'u'};

        // Impresión directa del contenido de los arreglos, utilizando
        // para ello bibliotecas del lenguaje de programación.
        System.out.println(":: Bloque de memoria asignado a cada arreglo.");
        System.out.println("Arreglo [A]: " + Arrays.toString(A));
        System.out.println("Arreglo [B]: " + Arrays.toString(B));
        System.out.println("Arreglo [C]: " + Arrays.toString(C));
        System.out.println("Arreglo [D]: " + Arrays.toString(D));

        // Recorriendo los arreglos de diversas maneras.
        // Usando el ciclo foreach
        System.out.println("\nUsando un ciclo ForEach para recorrer el contenido del arreglo A.");
        for(int x: A)
            System.out.println(x);

        System.out.println(" :: ");

        // Usando el ciclo for
        System.out.println("\nUsando un ciclo For para recorrer el contenido del arreglo B.");
        for(int n = 0; n < B.length; n++)
            System.out.println(n + " :: " + B[n]);

        System.out.println(" :: ");

        // Usando el ciclo while
        System.out.println("\nUsando un ciclo While para recorrer el contenido del arreglo C.");
        int i = 0;
        while(i < size) {
            System.out.println(i + " :: " + (C[i] == null ? " - " : C[i]));
            i ++;
        }

        System.out.println(" :: ");

        // Usando el ciclo do-while
        System.out.println("\nUsando un ciclo Do-While para recorrer el contenido del arreglo D.");
        i = 0;
        do {
            System.out.println(i + " :: " +  D[i]);
            i++;
        } while(i < D.length);

    }
}