import java.util.Random;
import java.util.Scanner;

public class Problema01_ProcessM {

    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el limite de las COLUMNAS de la matriz: ");
        int limiteC = sc.nextInt();
        System.out.println("Ingrese el limite de las FILAS de la matriz: ");
        int limiteF = sc.nextInt();

        int[][] matriz = new int[limiteF][limiteC]; // matriz[row][col]
        generarMatriz(matriz);
        presentarMatriz(matriz);
        matrizPares(matriz);
        matrizImpares(matriz);
        System.out.println("\n--- Promedio de la matriz ---");
        System.out.printf("%.2f", promedioMatriz(matriz));
    }

    public static void generarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(9);
            }
        }

    }

    public static void presentarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void matrizPares(int[][] matriz) {
        System.out.println("--- Números de pares de la matriz ---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }

    public static void matrizImpares(int[][] matriz) {
        System.out.println("\n--- Números de impares de la matriz ---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 2 != 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }

    public static double promedioMatriz(int[][] matriz) {
        int pM = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                pM += matriz[i][j];
            }
        }
        return (double) pM / (matriz.length * matriz[0].length);
    }
}