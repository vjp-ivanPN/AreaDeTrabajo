/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        // Declaro mis variables al principio del codigo
        int numero;
        // En esta parte del codigo llamo al metodo PedirNumero para que
        // el usuario me de un numero pero controlando que no me introduzca un 0
        System.out.println("Introduzca su numero");
        numero = pedirNumero();
       Ejercicio14.primo(numero);
    }

    //En el metodo pedir numero lo que busco es que me de un numero mayor que 0
    public static int pedirNumero() {
      // Aqui declaro el valor de numero simplemente para que en el ejercicion no me de unread, ya que luego le doy yo el valor  
        int numero = 1;
        
        do {
            System.out.println("Por favor introduzca un numero distinto de 0 ");
            Scanner entrada = new Scanner(System.in);
            numero = entrada.nextInt();

        }
        
        while (numero <= 0);
        return numero;
      
    }

    // En este metodo , lo que busco es ver los numeros que hay entre el 1 y el numero dado
    // Y si el numero que me ha dado tiene otro divisor distinto de 1 y si mismo entonces no es primo
    // si no si es primo
  public static void primo(int num1) {
    
    int contador=0 ;
    
      for (int i = 1; i <= num1; i++) {
          
          if (i%3==0) {
              System.out.println(i + " Es divisible por 3");   
              contador++;
          }
         
          
      }
      System.out.println("Cantidad de numeros encontrados :" + contador );
    
    }
}
