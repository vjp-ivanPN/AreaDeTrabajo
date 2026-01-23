/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ivanp
 */
public class PedirTemp {
   
    public static int temperatura(String diaSemana, int diaMes){
       // No se por que pero cuando salta el error , salta pero aun asi sigue contando como si fuera la siguiente posicion del array
        boolean error= false;
        int temperatura =0;
        Scanner entrada = new Scanner(System.in);
        do { 
            
            try {
             
        System.out.println("Por favor introduzca la temperatura Dia "+diaMes+"  ("+diaSemana+")");
    
        temperatura = entrada.nextInt();
    
        } catch (InputMismatchException e) {
            System.out.println("Por favror introduzca un numero "+ e);
            error=true;
           
            entrada.nextLine();
        }
          return temperatura;
  
        } while (error==false);
        
    }
    
    public static void rellenarArray(int temp[][], String semana[]){
        int dia = 0;
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                dia++;
                temp[i][j]=temperatura(semana[j],dia);
            }
            
        }
    
    }
   
}
