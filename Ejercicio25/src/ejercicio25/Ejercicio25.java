/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;

public class Ejercicio25 {
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

       
        int suma = num1 + num2 + num3;
        int producto = num1 * num2 * num3;

        
        System.out.println("resultado de la suma: " + suma);
        System.out.println("resultado del producto1: " + producto);

        
    }
}
