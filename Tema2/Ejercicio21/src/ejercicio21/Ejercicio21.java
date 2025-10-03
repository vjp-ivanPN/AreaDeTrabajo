/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {
    
    final static int HORAS = 3600; 
    
    final static int MINUTOS = 60;
    
public static void main(String[] args) {
        
        int segundos , minutos , horas , tiempo ;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad de segundos deseada");
        
        tiempo = entrada.nextInt();
        
       // horas = tiempo / MINUTOS;
        //minutos= (tiempo/ SEGUNDOS) % MINUTOS ;
       // segundos= tiempo % MINUTOS;
       
    segundos = (tiempo % HORAS)% MINUTOS;
    minutos = (tiempo / MINUTOS)%MINUTOS;
       horas= tiempo / HORAS;
       
        System.out.println("S = " + segundos);
        System.out.println("M = " + minutos);
        System.out.println("H = " + horas);
        // No he leido el enunciado bien , , me faltan los dias.
    }
    
}
