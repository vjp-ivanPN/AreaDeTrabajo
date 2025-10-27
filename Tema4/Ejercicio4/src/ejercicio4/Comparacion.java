/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

public class Comparacion {

    public static void menor(int num1, int num2, int num3) {
        int comparar = 0;
        if (num1 < num2 && num1 < num3) {

            comparar = num1;

        } else if (num2 < num3) {
            comparar = num2;
        } else {
            comparar = num3;
        }
        System.out.println("El numero mas chico es " + comparar);
    }

}
