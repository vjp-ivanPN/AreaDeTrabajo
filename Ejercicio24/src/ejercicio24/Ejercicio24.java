/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

 import java.util.Scanner;
public class Ejercicio24 {

        public static void main(String[] args) {
        
            Scanner entrada1 = new Scanner(System.in);
        
        System.out.print("Introduce la nota de lenguaje de mar: ");
        
        int lenguajeM = entrada1.nextbyte();

       
        Scanner entrada2 = new Scanner(System.in);
        
        System.out.print("Introduce la nota de progamacion: ");
        
        int programacion = entrada2.nextint();
        
        Scanner entrada3 = new Scanner(System.in);
        
        System.out.print("Introduce la nota de sI: ");
        
        int sI = entrada3.nextint();
        
        Scanner entrada4 = new Scanner(System.in);
        
        System.out.print("Introduce la nota de ingles: ");
        
        int ingles = entrada4.nextint();
        
        Scanner entrada5 = new Scanner(System.in);
        
        System.out.print("Introduce la nota de baseDatos: ");
        
        int baseDatos = entrada5.nextint();
        
        Scanner entrada6 = new Scanner(System.in);
        
        System.out.print("Introduce la nota de entornosDigitales: ");
        
        int entornosDigitales = entrada6.nextint();
        
        int media1Daw = (ingles + lenguajeM + programacion + sI + entornosDigitales + baseDatos)/2;

            System.out.println("Nota media del curso = "+ media1Daw); 
            
            
            
    }
    
}
