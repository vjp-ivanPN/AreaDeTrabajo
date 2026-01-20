/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejertcicio2;

import java.util.Scanner;

/**
 *
 * @author ivanp
 */
public class Ejertcicio2 {

    public static void main(String[] args) {
        int[] numeros = new int[7];
        int i;
        for (i = 0; i<7; i++) {
        
        }
    }

    public int PedirNumero() {
        int numeros = 0;
        System.out.println("Por favor introduzca los valores deseados");
        Scanner entrada = new Scanner(System.in);
        numeros = entrada.nextInt();
        return numeros;
    }
}
