public class Main {
    public static void main(String[] args) {
        // Declaración del arreglo con valores ya predefinidos.
        double []B = new double[] {1.33, 2.65, 3.89, 4.04, 5.12, 6.56, 7.09};
        // Declaración de los variables de apoyo.
        double suma = 0;
        double suma2 = 0;

        // Se recorre el arreglo, extrayendo elemento por elemento.
        // Realizando la suma de los valores, de manera sencilla, y
        // por el otro lado, elevando al cuadrado y acumulando los
        // valores.
        for(int n = 0; n < B.length; n++) {
            suma += B[n];
            suma2 += Math.pow(B[n], 2);
        }

        // Se realiza el procedimiento de la suma de cuadrados
        // para obtener la varianza y la desviación estándar.
        double SC = suma2 - Math.pow(suma, 2) / B.length;
        double varianza = SC / (B.length - 1);

        // Se muestra el resultado final.
        System.out.println("Desviacion standard: " + Math.sqrt(varianza));
    }
}