
package ejercicio21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio21 {

 
    public static void main(String[] args) {
        
        int numero1 , numero2;
        float resultado;
       try {
           System.out.println("Introduce el primer dígito = ");
           Scanner entrada1 = new Scanner(System.in);
           numero1= entrada1.nextInt();
           System.out.println("Introduzca el segundo dígito");
           Scanner entrada2 = new Scanner(System.in);
           numero2 = entrada2.nextInt();
           resultado = numero1 / numero2 ;
           System.out.println("Division Num1 / Num2 = " + numero1 + " / " + numero2 );
       }
       catch (ArithmeticException e){
           
           System.out.println("La división entre 0 no es posible");
       }
       catch (InputMismatchException e){
          
           System.out.println("Por favor introduzca un numero ");
       }
    }
    
}
