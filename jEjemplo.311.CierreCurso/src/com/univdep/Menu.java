package com.univdep;

public class Menu extends iData {
    public void Options() {
        System.out.println("Opciones. \n");
        System.out.println("[1] Área");
        System.out.println("[2] Perímetro");
        System.out.println("[3] Salir \n");
    }

    public void run() {
        boolean exit = false;

        do {
            Options();
            int value;
            int option = getValueUInt("Su opción: ");
            switch (option) {
                case 1 -> {
                    value = getValueInt("Tamaño de la figura: ");
                    Area A = new Area();
                    A.setLimit(value);
                    System.out.println("\n" + A.drawing());
                }

                case 2 -> {
                    value = getValueInt("Tamaño de la figura: ");
                    Perimeter P = new Perimeter();
                    P.setLimit(value);
                    System.out.println("\n" + P.drawing());
                }

                case 3 -> {
                    System.out.println("Hasta pronto!!!");
                    exit = true;
                }

                default-> System.out.println("Error. La opción solicitada no existe");

            }
        } while(!exit);
    }
}
