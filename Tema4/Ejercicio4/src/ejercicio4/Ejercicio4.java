/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        int dato1, dato2, dato3;
        try {
            Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer digito");
        dato1 = entrada.nextInt();
        System.out.println("Introduce el segundo digito");
        dato2 = entrada.nextInt();
        System.out.println("Introduce el tercer digito");
        dato3 = entrada.nextInt();
       Comparacion.menor(dato1, dato2, dato3);
        } catch (InputMismatchException e) {
        }
        
    }

}
