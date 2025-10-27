/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

import java.util.Scanner;

public class Ejercicio27 {

    
    
    public static void main(String[] args) {
        int numero1 , numero2 , numeroMenu  ;
        
        
        System.out.println("introduzca el primer digito");
        Scanner entrada = new Scanner(System.in);
        numero1 = entrada.nextInt();
        System.out.println("introduzca el segundo digito");
        numero2 = entrada.nextInt();
        
        do {
            System.out.println("1 : suma");
            System.out.println("2 : resta");
            System.out.println("3 : producto");
            System.out.println("4 : division");
            System.out.println("5 : Salir");
            
            System.out.println("Introduce el numero de menu : ");
            numeroMenu= entrada.nextInt();
           
            switch (numeroMenu) {
                case 1:
                    System.out.println("-----------------------------------------------------------------------------------");
                    System.out.println("Suma: "+(numero1 + numero2)); 
                    System.out.println("-----------------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------------------------------");
                    System.out.println("Resta: "+(numero1 - numero2));
                    System.out.println("-----------------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("-----------------------------------------------------------------------------------");
                    System.out.println("Producto: "+(numero1 * numero2));
                    System.out.println("-----------------------------------------------------------------------------------");
                    break;
                case 4:
                    try {
                //mi intencion era hacer una division con float
                //pero no pudo ser por que primero hace la division en int = 0 y el float de 0 es 0.0
                            System.out.println("-----------------------------------------------------------------------------------");
                            System.out.println("Division = " +(numero1 / numero2) );  
                            System.out.println("-----------------------------------------------------------------------------------");
                    } catch (ArithmeticException e) {
                       
                        System.out.println("No se puede dividir entre 0 ");
                        System.out.println("-----------------------------------------------------------------------------------");
                    }
                    break;
                
                case 5 :
                    System.out.println("Salir del programa");
                    break;
                    
                    default :
                    System.out.println("-----------------------------------------------------------------------------------");
                    System.out.println("Elija otra opcion");
                    System.out.println("-----------------------------------------------------------------------------------");
            }       
                
                    
          
        } while (numeroMenu!=5);
        
    }
    
}
