
package ejercicio1;

import java.util.Scanner;
import newMetodo.newMetodo;
/**
 *
 * @author ivanp
 */
public class Ejercicio1 {

    //En este programa se desea crear un metodo que nos dira si el numero 
    // introducido por el usuario es positivo o negativo.
    
    public static void main(String[] args) {
        int numero;
        
         Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();

        newMetodo.detector(numero);
    }
    
}
