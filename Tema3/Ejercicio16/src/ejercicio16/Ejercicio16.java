/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

public class Ejercicio16 {

    public static void main(String[] args) {
        
        int cuenta = 0 ;
        
        for (int i = 20; i<= 160; i++) {
            
            if (i % 2 !=0) 
            {
             cuenta++;   
            }
            System.out.println("numero de numeros impares" + i); 
            System.out.println("numero de vueltas" + cuenta);
        }
                
}
    
}
