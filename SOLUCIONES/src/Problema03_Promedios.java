import java.util.Scanner;

public class Problema03_Promedios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es su promedio:");
        double promedio = sc.nextDouble();
        System.out.println(calcularPromedio(promedio));
    }

    public static String calcularPromedio(double promedio) {
        if (0 < promedio && promedio <= 5) {
            return "Regular";
        } else if (promedio <= 8) {
            return "Bueno";
        } else if (promedio <= 9) {
            return "Muy Bueno";
        } else if (promedio <= 10) {
            return "Sobresaliente";
        } else {
            return "El promedio es NO valido";
        }

    }
}
