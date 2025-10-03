/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author ivanp
 */
public class Ejercicio10 {

  
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        int vaso = 0;
        vaso= numero1;
        numero1 = numero2; 
        System.out.println("numero1 = "+ numero1);
        System.out.println("vaso ="+ vaso);
        numero1 = numero2 ;
        System.out.println("numero1 ahora es igual a =" + numero1);
        numero2 = vaso;
        System.out.println("numero2 = " + numero2);
    }
    
}
