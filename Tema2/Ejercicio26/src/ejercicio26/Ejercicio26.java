/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;
// No he querido borrar este ejercicio , por que mas adelante se supone 
//que podria hacerse asi , asi que queria dejarlo para corregir en un futuro.
public class Ejercicio26 {

    
    public static void main(String[] args) {
        //La idea de realizarlo así , es por que de la forma realizada en clase
        //se podia ingresar mas de 4 numeros y no sabia como podia hacer para 
        // que esto no fuera asi , asi que se me ocurrio hacerlo de esta forma.
        
        Scanner entrada1 = new Scanner(System.in);
        
        System.out.print("introduzca numero1: ");
        int num1 = entrada1.nextInt();
        
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("introduzca numero2: ");
        int num2 = entrada2.nextInt();
       
        Scanner entrada3 = new Scanner(System.in);
        System.out.print("introduzca numero3: ");
        int num3 = entrada3.nextInt();
       
        Scanner entrada4 = new Scanner(System.in);
        System.out.print("introduzca numero4: ");
        int num4 = entrada3.nextInt();

       // Mal, no se como concatenar los numeros para que me salga de resultado
       // el numero entero introducido.
        int suma = num1 + num2 + num3 + num4;
        
        System.out.println("Tu numero es: " + suma);
        System.out.println("numero1 =" + num1);
        System.out.println("numero2 =" + num2);
        System.out.println("numero3 =" + num3);
        System.out.println("numero4 =" + num4);
    }
    
}
