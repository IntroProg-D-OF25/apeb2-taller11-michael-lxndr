public class Problema05_SumaMatrices {

    public static void main(String[] args) {
        // Ejemplo de matriz cuadrada
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Llamadas a los métodos
        int suma = sumarMatriz(matriz);
        int resta = restarMatriz(matriz);
        int multiplicacion = multiplicarMatriz(matriz);

        // Imprimir los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
    }

    // Método para sumar todos los elementos de una matriz
    public static int sumarMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    public static int restarMatriz(int[][] matriz) {
        int resta = 0;
        boolean esPrimero = true; // Para tomar el primer elemento como base
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (esPrimero) {
                    resta = matriz[i][j]; // Asignar el primer valor
                    esPrimero = false;
                } else {
                    resta -= matriz[i][j];
                }
            }
        }
        return resta;
    }

    public static int multiplicarMatriz(int[][] matriz) {
        int multiplicacion = 1; // Inicializar en 1 para la multiplicación
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                multiplicacion *= matriz[i][j];
            }
        }
        return multiplicacion;
    }
}

