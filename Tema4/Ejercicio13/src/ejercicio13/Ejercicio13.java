/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;


public class Ejercicio13 {

    
    public static void main(String[] args) {
        int inicio=1;
        int dato;
        
        do {            
          
            dato = Algoritmo.dato();
            
        } 
        
        while (Algoritmo.comparacion(dato)==false);
       
        Algoritmo.impresion(inicio, dato);
        
    }
    
}
