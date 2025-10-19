/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1 , numero2;
        int resultado;
       try {
           System.out.println("Introduce el primer dígito = ");
           Scanner entrada = new Scanner(System.in);
           numero1= entrada.nextInt();
           System.out.println("Introduzca el segundo dígito");
           numero2 = entrada.nextInt();
           resultado = numero1 + numero2 ;
           System.out.println("Suma Num1 + Num2 = " + numero1 + " + " + numero2 + " = " + resultado );
       }
       
       catch (InputMismatchException e){
          
           System.out.println("Por favor introduzca un numero ");
       }
    }
    
    
}
