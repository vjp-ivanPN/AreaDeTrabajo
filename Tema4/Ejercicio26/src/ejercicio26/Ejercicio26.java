
package ejercicio26;

import java.util.Scanner;

public class Ejercicio26 {

   
    public static void main(String[] args) {
        
      int numero;
      //hago un escaner para que el usuario introduzca el numero ,y con el metodo comparo para ver si es primo o no  
      Scanner entrada = new Scanner(System.in);
      System.out.println("por favor introduzca el  numero : ");
      numero = entrada.nextInt();
     // Aqui llamo al metodo esPrimo de la clase Primo.
      Primo.esPrimo(numero);
           
    }
    
}