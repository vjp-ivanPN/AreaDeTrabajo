
package ejercicio26;

public class Primo {
   // En este metodo , lo que queremos es ver si el numero es primo , por lo que le damos el valor booleano falso 
   // y en base a eso , realizamos las comparaciones
    public static boolean esPrimo(int num) {
      // declaro una variable i , que va a ser por el que empieze a comparar , ya que todos los numeros son divisibles por 1  
        int i=2;
        boolean encontrado = false;
        
        while (i < num&&!encontrado) {
           
            if (num % i == 0) {
                encontrado = true;
            }
            else {
                i++;
            }         
        }
        
        if (!encontrado) {
            System.out.println("El numero introducido es primo ");
        } else {
            System.out.println("El numero introducido no es primo ");
        }
        
        return encontrado;
    }
}