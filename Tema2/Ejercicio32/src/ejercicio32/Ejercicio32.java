/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;
import java.util.Scanner;

public class Ejercicio32 {
    
    final static int CINCUENTA = 50;
    final static int VEINTE = 20;
    final static int DIEZ = 10;
    final static int DOS = 2;
    final static int UNO = 1;
    
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("introduzca cantidad a retirar: ");
       
        int numero = entrada.nextInt();
        
      int cantidad50 ;
      int cantidad20 ;
      int cantidad10 ;
      int cantidad2  ;
      int cantidad1  ;
   // optimizar el codigo
      cantidad50 = numero / CINCUENTA ;
      
      cantidad20 = (numero % CINCUENTA)/VEINTE ;
      
      cantidad10 = ((numero % CINCUENTA)%VEINTE)/ DIEZ ;

      cantidad2 = (((numero % CINCUENTA)%VEINTE)% DIEZ)/DOS ;

      cantidad1 = ((((numero % CINCUENTA)%VEINTE)% DIEZ)%DOS) /UNO ;
       
      System.out.println("Su cantidad total es = " + numero);
      System.out.println("Billetes de 50 = " + cantidad50);
      System.out.println("Billetes de 20 = " + cantidad20);
      System.out.println("Billetes de 10 = " + cantidad10);
      System.out.println("Billetes de 2 = " + cantidad2);
      System.out.println("Billetes de 1 = " + cantidad1);
    }
    
}
