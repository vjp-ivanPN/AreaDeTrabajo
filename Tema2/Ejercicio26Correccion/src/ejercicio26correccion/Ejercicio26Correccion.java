/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26correccion;

import java.util.Scanner;

public class Ejercicio26Correccion {

    public static void main(String[] args) {
     
        int num1 , num2 , num3, num4  ; //aqui defino las variables que enseñare por el sout
        
        System.out.println("Por favor introduzca su numero de 4 cifras = ");
        Scanner entrada = new Scanner(System.in);
       
        
        int numero = entrada.nextInt();
        
        num4= (numero % 10) ; //Aqui calculo el modulo para conseguir la primera cifra.
        
        num3= (numero/10)%10; //con este paso dividiremos el numero entre  
        
        num2= (numero/100)%10; // igual que en los ejemplos anteriores
        
        num1=  (numero/1000);
        
        System.out.println("Primera cifra :" + num1);
        System.out.println("Segunda cifra :" + num2);
        System.out.println("Tercera cifra :" + num3);
        System.out.println("Cuarta  cifra :" + num4);

    }
    
    
}
