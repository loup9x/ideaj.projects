package com.univdep;

public class Main {
    /*
    Declaración de una función, en donde se realiza
    la impresión de un simple mensaje de bienvenida.
     */
    public static void ImprimirMensaje() {
        System.out.println(":. Hola Mundo!!!!");
    }

    /*
    Declaración de una función con argumento, en donde se
    realiza la impresión de un simple mensaje de
    bienvenida.
     */
    public static void ImprimirTexto(String mensaje) {
        System.out.println(mensaje);
    }


    public static void main(String[] args) {
        /*
        Se realiza la llamada o invocación a la función,
        y es en este momento, donde se desarrollan las
        sentencias, y concluyendo estas, vuelve a continuar
        el programa.
        */
	    ImprimirMensaje();
        System.out.println();
        ImprimirTexto(":: Hola mundo!!!\nFunción con argumentos");
    }
}
