package com.univdep;

public class Main {
    public static void main(String[] args) {
        // Declaración de variables
        int opcion;
        boolean salir = false;

        do {
            // Mostrando al usuario el menú de opciones
            System.out.println("Menú de mensajes\n");
            System.out.println("[1] Mensaje de bienvenida");
            System.out.println("[2] Mensaje de salida");
            System.out.println("[3] Salir \n");
            System.out.print("\tSu opción es:");

            // Elegir la opción deseada
            opcion = (new java.util.Scanner(System.in)).nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Welcome to the hell");
                    break;
                case 2:
                    System.out.println("Goodbye to heaven");
                    break;
                case 3:
                    System.out.println("Adios!!!");
                    salir = true;
                    break;
                default:
                    System.out.println("Su opción no es válida.");
            }
        }while(!salir);
    }
}
