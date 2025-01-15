import java.util.Scanner;

public class Problema04_Plantilla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continua = true;
        String nombre;
        int id;
        while (continua) {
            System.out.println("--- Seleccione una opción ---");
            System.out.println("1. Calcular el valor de la planilla de luz");
            System.out.println("2. Calcular el valor del predio de un bien inmueble");
            System.out.println("3. Salir del programa");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Ingrese el nombre del Cliente");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese sus cédula");
                    sc = new Scanner(System.in);
                    id = sc.nextInt();
                    System.out.println("Ingrese los kilowatts consumidos al mes");
                    int kilowattsT = sc.nextInt();
                    System.out.println("Ingrese los valores del Kilowatts");
                    int vKilowatts = sc.nextInt();
                    System.out.println(planillaLuz(nombre, id, kilowattsT, vKilowatts));
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del Cliente");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese sus cédula");
                    sc = new Scanner(System.in);
                    id = sc.nextInt();
                    System.out.println("Ingrese el valor del inmueble");
                    int inmueble = sc.nextInt();
                    System.out.println(valorPredio(nombre, id, inmueble));
                    break;
                case 3:
                    continua = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

    }

    public static String planillaLuz(String name, int id, double kwMes, double costoKw) {
        return "Cliente " + name + " con cédula  " + id + "debe cancelar el valor de $" + (costoKw * kwMes) + ".";
    }

    public static String valorPredio(String name, int id, double valorInmueble) {
        return "Cliente " + name + " con cédula " + id + " tiene un bien inmueble valorado en " + valorInmueble + " y tiene que pagar de predio $" + (valorInmueble * 0.02) + ".";
    }
}
