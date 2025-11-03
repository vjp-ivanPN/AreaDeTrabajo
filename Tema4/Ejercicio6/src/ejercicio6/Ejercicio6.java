/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        int nota = 0;
        do {

            try {
                System.out.println("Por favor introduce la nota obtenida");
                Scanner entrada = new Scanner(System.in);
                nota = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor introduzcac un numero");
            }

            Notas.entrada(nota);

        } while (nota > 10 || nota < 0);
    }

}
