/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Algoritmo {

    public static int dato() {
       int dato= 0;
        
       try {
           
            System.out.println("Por favor introduzca su numero");
            Scanner entrada = new Scanner(System.in);
            dato = entrada.nextInt();
            
        } catch (InputMismatchException e) {
            System.out.println("introduzca un numero");
        }
        return dato;
    }

    public static boolean comparacion(int num1) {
        boolean mayor = false;

        if (num1 > 1) {
            mayor = true;

        }
        return mayor;
    }

    public static void impresion(int num1, int num2) {

        for (num1 = 1; num1 <= num2; num1++) {
            System.out.println("Su numero es = " + num1);
        }

    }

}
