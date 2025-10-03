/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author ivanp
 */
public class Ejercicio15 {

    
    public static void main(String[] args) {
        
        int tiempo = 10000;
      int minutos;
      int segundos = 60;
      int segundosR;
      segundosR= tiempo % segundos ;
      minutos = 60 ;
      int minutosR;
      minutosR = (tiempo / segundos) % minutos;
       int horas;
       horas = 10000 / 3600;
     
      System.out.println("10000s es igual a ");
      System.out.println("Segundos =" + segundosR);
      System.out.println("minutos =" + minutosR);
      System.out.println("horas = "+ horas );
    }
    
}
