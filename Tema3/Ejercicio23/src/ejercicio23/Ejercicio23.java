/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author ivanp
 */
public class Ejercicio23 {

   
    public static void main(String[] args) {
        int numero = 1 ;
        int numeroCliente;
       do {
           System.out.println("Introduzca el numero deseado");
           Scanner entrada = new Scanner(System.in);
           numeroCliente= entrada.nextInt();
           }
       while(numeroCliente<1);
       for(numero=1;numero<=numeroCliente;numero++)
       {
            System.out.println("Numeros = " + numero);
       }
       
        
    }
    
}
