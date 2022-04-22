package com.univdep;

public class Main {
    public static void main(String[] args) {
        int letra = 0;              // Contador
        final char caracter = 'a';  // Constante
        final int tope = 26;        // Bandera [constante]
        int acumulador = caracter;
        while(letra < tope) {
            System.out.println( (char) acumulador );  //
            letra ++;   // letra = letra + 1;
            acumulador = (int) caracter + letra;
        }
        System.out.println();
        for(int n = 0, ac = caracter; n < tope; n++, ac = (int) caracter + n)
            System.out.println( (char) ac );
    }
}
