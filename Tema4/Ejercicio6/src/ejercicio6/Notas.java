package ejercicio6;

public class Notas {
// me da falla la logica para controlar el bucle.

    public static void entrada(int num1) {
// En este metodo controlamos el tipo de dato que entra y sacamos la informacion en forma de sout
        
            if (num1 >= 0 && num1 <= 4) {
                System.out.println("Tu nota es " + num1 + " = Suspenso");
            } else if (num1 > 4 && num1 <= 6) {
                System.out.println("Tu nota es " + num1 + " = Bien");
            } else if (num1 > 6 && num1 <= 8) {
                System.out.println("Tu nota es " + num1 + " = Notable");
            } else if (num1 > 8 && num1 <= 10) {
                System.out.println("Tu nota es " + num1 + " = Sobresaliente");
            } else {
                System.out.println("Por favor introduzca un numero entre 0 y 10 incluidos");
            }

        

    }
}
