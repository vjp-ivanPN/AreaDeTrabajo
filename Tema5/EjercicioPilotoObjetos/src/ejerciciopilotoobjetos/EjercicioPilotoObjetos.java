/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopilotoobjetos;

/**
 *Este ejercicio es el introdcuctorio al tema , asi que se siguen los pasos de la profesora en clase
 * @author ivanp
 */
public class EjercicioPilotoObjetos {

    public static void main(String[] args) {
        // Crearemos dos coches o instaciamos dos objetos
      Coche miCoche = new Coche();  
        System.out.println(miCoche.toString()); 
        miCoche.setEspejos(4);
        System.out.println(miCoche.toString());
        // Aqui le ponemos los parametros directamente
        Coche tuCoche= new Coche("Michelin","Bajo",3);
        System.out.println(tuCoche.toString());
        System.out.println(tuCoche.getRuedas());
        
    }
   
    
}
