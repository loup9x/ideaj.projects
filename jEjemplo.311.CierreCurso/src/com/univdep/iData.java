package com.univdep;

public class iData implements Data {
    @Override
    public int getValueInt(String message) {
        do {
            try {
                System.out.print(message);
                return (new java.util.Scanner(System.in)).nextInt();
            } catch(Exception ex) {
                System.err.println("Error : El dato ingresado no corresponde a un valor numérico.");
            }
        } while (true);
    }

    @Override
    public int getValueUInt(String message) {
        do {
            int value = getValueInt(message);
            if (value < 0)
                System.err.println("Error : El dato ingresado no puede ser menor a cero.");
            else
                return value;
        } while (true);
    }
}
