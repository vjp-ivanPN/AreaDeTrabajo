/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

   

        public static void main(String[] args) {
            // inicializamos las variables
            int numero1, numero2, numero3, numero4;
            // hacemos un scanner que pida los cuatro numeros que necesitamos

            Scanner entrada = new Scanner(System.in);
            System.out.println("Por favor, introduzca el primer número: ");

            numero1 = entrada.nextInt();

            System.out.println("Por favor introduzca el segundo numero: ");
            numero2 = entrada.nextInt();

            System.out.println("Por favor introduzca el tercer numero: ");
            numero3 = entrada.nextInt();

            System.out.println("Por favor introduzca el cuarto numero: ");
            numero4 = entrada.nextInt();

            // LLamo al metodo
            Comparador.burbuja(numero1, numero2, numero3, numero4);
        }
    
}
