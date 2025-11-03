/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        int numero1, numero2;

        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduzca el primer digito");
            numero1 = entrada.nextInt();
            System.out.println("Introduzca el segundo digito");
            numero2 = entrada.nextInt();

            if (numero1 >= 10) {
                Operaciones.producto(numero1, numero2);
            } else {

                Operaciones.suma(numero1, numero2);

            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un valor valido");
        }

    }

}
