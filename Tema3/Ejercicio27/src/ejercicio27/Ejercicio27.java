/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

import java.util.Scanner;

public class Ejercicio27 {

    
    public static void main(String[] args) {
        int numero1 , numero2 , numeroMenu;
        System.out.println("introduzca el primer digito");
        Scanner entrada = new Scanner(System.in);
        numero1 = entrada.nextInt();
        System.out.println("introduzca el segundo digito");
        numero2 = entrada.nextInt();
        do {
            System.out.println("Introduce el numero de menu : ");
            numeroMenu= entrada.nextInt();
            switch (numeroMenu) {
                case 1:
                    System.out.println("Suma: "+(numero1 + numero2));  
                    break;
                case 2:
                    System.out.println("Resta: "+(numero1 - numero2));  
                    break;
                case 3:
                    System.out.println("Producto: "+(numero1 * numero2));  
                    break;
                case 4:
                    try {
                        float numero1F = numero1;
                        float numero2F = numero2;

                            System.out.println("Division = " + (numero1F/numero2F) );  

                    } catch (ArithmeticException e) {
                        System.out.println("No se puede dividir entre 0 ");
                    }
                    break;
                
                case 5 :
                    System.out.println("Salir del programa");
                    
                    default :
                    System.out.println("Elija otra opcion");
            }
                
                    
          
        } while (numeroMenu!=5);
        
    }
    
}
