import java.util.Scanner;

public class Problema02_Areas {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        while (continuar) {
            System.out.println("--- Area de: ---");
            System.out.println("1)\tCuadrado");
            System.out.println("2)\tTriangulo");
            System.out.println("3)\tRectángulo");
            System.out.println("4)\tExit");
            int num = sc.nextInt();


            switch (num) {
                case 1:
                    System.out.println("Dame un lado del Cuadrado");
                    double lC = sc.nextDouble();
                    System.out.println("El area del cuadrado es de:\t" + areaCuadrado(lC) + "\n");
                    break;
                case 2:
                    System.out.println("Dame la base del Triangulo");
                    double bT = sc.nextDouble();
                    System.out.println("Dame la altura del Triangulo");
                    double aT = sc.nextDouble();
                    System.out.println("El area del rectángulo es de:\t" + areaTriangulo(bT, aT) + "\n");
                    break;
                case 3:
                    System.out.println("Dame la base del Rectángulo");
                    double bR = sc.nextDouble();
                    System.out.println("Dame la altura del Rectángulo");
                    double aR = sc.nextDouble();
                    System.out.println("El area del rectángulo es de:\t" + areaRectangle(bR, aR) + "\n");
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("\n--- Opción no valida ---\n");
                    break;
            }
        }
    }

    public static double areaCuadrado(double l) {
        return l * l;
    }

    public static double areaRectangle(double b, double a) {
        return b * a;
    }

    public static double areaTriangulo(double b, double a) {
        return (b * a) / 2;
    }
}