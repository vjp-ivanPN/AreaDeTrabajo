/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;

public class Ejercicio26 {

    
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        
        System.out.print("introduzca numero1: ");
        int num1 = entrada1.nextInt();
        
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("introduzca numero2: ");
        int num2 = entrada2.nextInt();
       
        Scanner entrada3 = new Scanner(System.in);
        System.out.print("introduzca numero3: ");
        int num3 = entrada3.nextInt();
       
        Scanner entrada4 = new Scanner(System.in);
        System.out.print("introduzca numero4: ");
        int num4 = entrada3.nextInt();

       // Mal :(
        int suma = num1 + num2 + num3 + num4;
        
        System.out.println("Tu numero es: " + suma);
        System.out.println("numero1 =" + num1);
        System.out.println("numero2 =" + num2);
        System.out.println("numero3 =" + num3);
        System.out.println("numero4 =" + num4);
    }
    
}
