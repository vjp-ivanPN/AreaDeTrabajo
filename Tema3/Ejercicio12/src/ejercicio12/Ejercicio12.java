/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;


public class Ejercicio12 {

    
    public static void main(String[] args) {
       int numero = 11;
       int numeroPar;
       
       
       do{
           
           
           
           numeroPar = numero%2;
           if (numeroPar==0) {
               System.out.println("numero par ="+ numero);
              
           }
          
            numero++;
       }
       
       while(numero<133);
    }
   
    
}
