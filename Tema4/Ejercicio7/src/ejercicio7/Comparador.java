/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

public class Comparador {

    public static void burbuja(int num1, int num2, int num3, int num4) {
        int aux;

        // Se realiza un for por que queremos usar el mismo codigo 3 veces, ya que sabemos las veces que tenemos que hacerlo , le ponemos que se repita 3 veces.
        for (int i = 0; i < 3; i++) {

            // Comoparo los numeros que me han dado a ver cual es menor, y lo sustituyo por el auxiliar, asi guardo el valor de la variable sin perderlo-
            if (num1 > num2) {
                aux = num1;
                num1 = num2;
                num2 = aux;
            }

            if (num2 > num3) {
                aux = num2;
                num2 = num3;
                num3 = aux;
            }

            if (num3 > num4) {
                aux = num3;
                num3 = num4;
                num4 = aux;
            }
        }
        //imprimo el resultado en pantalla, como es void no se guarda , asi que se entregara el resultado tal cual , sin necesidad de return.
        System.out.println("Orden de menor a mayor " + num1 + " < " + num2 + " < " + num3 + " < " + num4);
    }
}
