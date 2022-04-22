package com.univdep;
public class Main {
    public static void main(String[] args) {
        // Primera forma de impresión de información.
        System.out.println("Mensaje de texto");
        System.out.print("Número: ");
        System.out.println(3.14159);
        System.out.print("Carácter: ");
        System.out.println('%');

        System.out.println();
        // Segunda forma de impresión de información.
        System.out.println("Mensaje de " + "texto " + "alterno");
        System.out.println("Imprimiendo números: " + 6.24855);
        System.out.println("Letras & Símbolos: " + '#');

        System.out.println();
        // Tercera forma de impresión de información.
        System.out.print("Mensaje de " +
                         "texto complementario. \n");

        System.out.println();
        // Cuarta forma de impresión de información
        System.out.print("""
                         Números alternos: 6
                                           8
                         """);
        System.out.print("""
                         Letras & Símbolos alternos: &
                                                     @
                         """);
    }
}
