/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;
import java.util.Scanner;
public class Ejercicio23 {
    
    
  public static void main(String[] args) {
      
      //double precioFinal; por que lo puse?
      
 
        Scanner entrada1 = new Scanner(System.in);
        
        System.out.print("Introduce el precio del producto: ");
        
        double precio = entrada1.nextDouble();

       
        Scanner entrada2 = new Scanner(System.in);
        
        System.out.print("Cuantas unidades deseas comprar?: ");
        
        int unidades = entrada2.nextInt();

        
        double total = precio * unidades;

        System.out.println(+ total + " €");

  
       
      
      
      
    }
  
  
    
}
