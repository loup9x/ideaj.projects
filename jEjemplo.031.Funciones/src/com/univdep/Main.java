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

        // Salto de linea para separar mensajes
        System.out.println();

        /*
        Se realiza la llamada o invocación a la función,
        y esta vez, se utiliza el concepto de argumento.
        Que es un tipo de dato, que contiene información
        a procesar. Siendo este caso el mostrar un mensaje
        ya un poco más elaborado. Y concluyendo este, vuelve
        a continuar el programa.
         */
        ImprimirTexto(":: Hola mundo!!!\nFunción con argumentos");
    }
}
