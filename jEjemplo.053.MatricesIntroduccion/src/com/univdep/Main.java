package com.univdep;

public class Main {
    public static void main(String []args) {
        // Declaración de las variables del sistema.
        int [][]M = new int[2][2];  // Matriz cuadrada de de 2 x 2.
        int i = 0;  // Renglón - Fila - Row
        int j = 0;  // Columna - Column
        final int size = 2;  // Tamaño de la matríz

        int n = 0;
        // Almacenamiento de información en la matriz.
        while(i < size) { // Accesando a los renglones de la matriz
            n += 2;
            while(j < size) {   // Acessando a las columnas de la matriz
                M[i][j] = n;    // Almacena un valor en la matriz, dada las coordendas de i x j
                j ++;   // Avanza a la siguiente columna
            }
            j = 0;  // Se coloca en la primera posición del renglón
            i ++;   // Avanza al siguiente renglón
        }

        i = 0;
        while(i < size) {
            while(j < size) {
                System.out.print(M[i][j] + "\t");
                j ++;
            }
            j = 0;
            System.out.println();
            i ++;
        }
    }
}
