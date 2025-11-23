/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocolacorreos;

import java.util.InputMismatchException;
import java.util.Scanner;
// Aqui pediremos que eliga la opcion entre las 3 dadas y si no es ninguna de estas , le dara un mensaje para que elija bien.
public class SubCorreos {
    
    public void mostrarMenu(int num1 , int numE ,int numR){
        
        do {            
             System.out.println("Por favor eliga una de las siguientes opciones : ");
             System.out.println("Opcion numero 1 : Entrega ");
             System.out.println("Opcion numero 2 : Recogida ");
             System.out.println("Opcion numero 3 : Salir ");
             
             switch (num1) {
                    case 1:
                        System.out.println("Eligió la opción Entrega, su puesto en la cola es E"+numE);
                        numE++;
                    break;
                    
                    case 2:
                    System.out.println("Eligió la opción Recogida, su puesto en la cola es R"+numR);
                        numE++;
                    break;
                    
                    case 3:
                        System.out.println("Usted eligio salir ");
                    break;
                    
                default:
                    System.out.println("Por favor eliga una opcion entre las tres dadas.");
            }
        } 
      while (num1==3);
      
    }
    //Con este metodo , le preguntamos al usuario el numero que desea elegir.
    public static int pedirOpcion(){
        int num1=0;
        try {
        Scanner entrada = new Scanner(System.in);
        num1= entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un numero ");
        }
        return num1;
    }
  
    // con el metodo aleatorio , lo que busco es que me genere un numero aleatorio entre el 65 y el 70, 
   //donde el 65 equivale a la letra A y el 70 a la F, los numeros comprendidos entre estos dos son las letras consecutivas, B,C,D,E
   
  
}
public int numeroAleatorio(){
s

}