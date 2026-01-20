package ejercicio15;

import java.util.Scanner;
//Inacabado flata comentarios y terminar el ejercicio aun.

public class Ejercicio15 {

    public static void main(String[] args) {
        int[] ventas = new int[12];
        menu(ventas);
    }

    public static void menu(int[] ventas) {

        int opcionElegida;

        try {
            do {

                System.out.println("1. Rellenar un array unidimensional de 12 posiciones con las ventas de coches\n"
                        + "mensuales. Estas ventas seran numeros aleatorios entre 10 y 100.");
                System.out.println("2. Mostrar las ventas introducidas en el punto anterior.");
                System.out.println("3. Mostrar las ventas introducidas al reves.");
                System.out.println("4. Que muestre la suma total de ventas del año.");
                System.out.println("5. Que muestre las ventas totales de los meses pares.");
                System.out.println("6. Que muestre el nombre del mes con mas ventas. (Necesitaras otro array con el\n"
                        + "nombre de los meses)");
                System.out.println("7. Salir del programa.");

                System.out.println("\nEscribe una opcion para las ventas");

                opcionElegida = pedirNumero();

                switch (opcionElegida) {
                    case 1:
                        rellenarVentas(ventas);
                        break;
                    case 2:
                        mostrarVentas(ventas);
                        break;

                    case 3:
                        mostrarVentasReves(ventas);
                        break;
                    default:
                        System.out.println("Salir del programa");
                }
            } while (opcionElegida != 7);
        } catch (Exception e) {

        }

    }

    private static int pedirNumero() {
        int opcion;
        Scanner entrada = new Scanner(System.in);

        opcion = entrada.nextInt();

        return opcion;
    }

    public static void rellenarVentas(int[] ventas) {
        System.out.println("Se rellena las ventas....\n");
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = (int) ((Math.random() * 91) + 10);
        }
    }

    public static void mostrarVentas(int[] ventas) {
        System.out.println("Mostramos las ventas generadas actualemente:\n");
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("[" + ventas[i] + "]");
        }
    }

    public static void mostrarVentasReves(int[] ventas) {
        System.out.println("Mostramos las ventas al reves:\n");

    }

}
