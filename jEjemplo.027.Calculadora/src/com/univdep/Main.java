package com.univdep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    int option;
        boolean exit = false;

        Scanner S = new Scanner(System.in);

        do {
            // Menú de opciones
            System.out.print(
                         """
                               :: Calculadora esencial ::
                               ::
                               :: [1] Suma 
                               :: [2] Producto
                               :: [3] Substracción
                               :: [4] División
                               :: [5] Salir
                               ::
                         """);
            System.out.print("      :: Opción: ");

            option = S.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.print(
                            """
                                  :. Suma
                                  ::
                            """);
                    System.out.print("      :: Valor para [x]: ");
                    double x = S.nextDouble();
                    System.out.print("      :: Valor para [y]: ");
                    double y = S.nextDouble();
                    System.out.println("      :: Resultado: " + (x + y));
                    System.out.print(
                            """
                                  ::
                            """);
                }

                case 2 -> {
                    System.out.print(
                            """
                                  :. Producto
                                  ::
                            """);
                    System.out.print("      :: Valor para [x]: ");
                    double x = S.nextDouble();
                    System.out.print("      :: Valor para [y]: ");
                    double y = S.nextDouble();
                    System.out.println("      :: Resultado: " + (x * y));
                    System.out.print(
                            """
                                  ::
                            """);
                }

                case 3-> {
                    System.out.print(
                            """
                                          :. Substracción
                                          ::
                                          :: Tipo de operación
                                          :: [1] x - y
                                          :: [2] y - x
                                          ::
                                    """);
                    System.out.print("      :: Opción: ");
                    option = S.nextInt();
                    switch (option) {
                        case 1 -> {
                            System.out.print(
                                            """
                                                  :. Sustracción
                                                  :: x - y
                                                  ::
                                            """);
                            System.out.print("      :: Valor para [x]: ");
                            double x = S.nextDouble();
                            System.out.print("      :: Valor para [y]: ");
                            double y = S.nextDouble();
                            System.out.println("      :: Resultado: " + (x - y));
                            System.out.print(
                                            """
                                                  ::
                                            """);
                        }
                        case 2 -> {
                            System.out.print(
                                    """
                                          :. Sustracción
                                          :: y - x
                                          ::
                                    """);
                            System.out.print("      :: Valor para [x]: ");
                            double x = S.nextDouble();
                            System.out.print("      :: Valor para [y]: ");
                            double y = S.nextDouble();
                            System.out.println("      :: Resultado: " + (y - x));
                            System.out.print(
                                    """
                                          ::
                                    """);
                        }
                        default -> {
                            System.out.print(
                                            """
                                                  ::
                                            Error :: La opción indicada no existe en el menú
                                                  :: de Substracción.
                                                  ::
                                            """);
                        }
                    }
                }

                case 4-> {
                    System.out.print(
                                    """
                                          :. División
                                          ::
                                          :: Tipo de operación
                                          :: [1] x / y
                                          :: [2] y / x
                                          ::
                                    """);
                    System.out.print("      :: Opción: ");
                    option = S.nextInt();
                    switch (option) {
                        case 1 -> {
                            System.out.print(
                                            """
                                                  :. División
                                                  :: x / y
                                                  ::
                                            """);
                            System.out.print("      :: Valor para [x]: ");
                            double x = S.nextDouble();
                            System.out.print("      :: Valor para [y]: ");
                            double y = S.nextDouble();
                            if (y != 0) {
                                System.out.println("      :: Resultado: " + (x / y));
                                System.out.print(
                                                """
                                                      ::
                                                """);
                            } else {
                                System.out.print(
                                                """
                                                      ::
                                                Error :: El valor de [y] no puede ser cero para esta operación.
                                                """);

                            }
                        }
                        case 2 -> {
                            System.out.print(
                                            """
                                                  :. División
                                                  :: y / x
                                                  ::
                                            """);
                            System.out.print("      :: Valor para [x]: ");
                            double x = S.nextDouble();
                            System.out.print("      :: Valor para [y]: ");
                            double y = S.nextDouble();
                            if (x != 0) {
                                System.out.println("      :: Resultado: " + (y / x));
                                System.out.print(
                                                """
                                                      ::
                                                """);
                            } else {
                                System.out.print(
                                                """
                                                      ::
                                                Error :: El valor de [x] no puede ser cero para esta operación.
                                                """);

                            }
                        }
                        default -> {
                            System.out.print(
                                            """
                                                  ::
                                            Error :: La opción indicada no existe en el menú
                                                  :: de la División.
                                                  ::
                                            """);
                        }
                    }
                }

                case 5 -> {
                    System.out.print(
                            """
                                  ::
                                  :: Hasta pronto !!!
                                  ::
                            """);
                    exit = true;
                }

                default -> {
                    System.out.print(
                            """
                                  ::
                            Error :: La opción indicada no existe en nuestro menú
                                  :: de opciones. Vuelva a indicar su opción.
                                  ::
                            """);
                }
            }
        } while (!exit);

        S.close();
    }
}