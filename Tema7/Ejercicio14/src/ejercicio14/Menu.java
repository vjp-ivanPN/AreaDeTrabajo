/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;
// En esta Clase , creare un metodo para monstrar las opciones del menu y otro para pedirlas

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
// Con este metodo , se visualizara el menu.

    public static void mostrarMenu() {

        System.out.println("Por favor elija la opcion que desea realizar");
        System.out.println("");
        System.out.println("Opcion 1 : Rellenar Temperatura.");
        System.out.println("");
        System.out.println("Opcion 2 : Mostrar temperatura.");
        System.out.println("");
        System.out.println("Opcion 3 : Visualizar Temperatura Media del Mes.");
        System.out.println("");
        System.out.println("Dia o Dias Mas calurosos del mes.");
        System.out.println("");
        System.out.println("Opcion 5 : Salir del Menu");
    }

    public static void menu(int temperatura[][], String diaSemana[]) {

        int opcionMenu;
        do {
            mostrarMenu();
            opcionMenu = opcion();
            switch (opcionMenu) {
                case 1:
                    PedirTemp.rellenarArray(temperatura, diaSemana);
                    break;

                case 2:
                    for (int i = 0; i < temperatura.length; i++) {
                        System.out.println("La temperatura de el dia " + "");
                        
                        for (int j = 0; j < temperatura[0].length; j++) {
                            System.out.println("LA TEMPERATURA DEL DIA " + diaSemana[i] + "ES " + temperatura[i][j]);

                        }

                    }
                    break;
                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;
                default:
                    System.out.println("Por favor introduzca un valor entre el 1 y el 5");
            }

        } while (opcionMenu != 5);

    }

    // En este metodo pedire la opcion que quiere elegir el usuario
    public static int opcion() {
        int opcion = 0;
        Scanner entrada = new Scanner(System.in);
        opcion = entrada.nextInt();
        return opcion;

    }

}
