/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

// Esta clase se extiende de Animales por lo que 
public abstract class Felinos extends Animales {

// Estas son los atributos de Felinos.
   public Felinos() {
        super();
    }

    public Felinos(String nombre, int edad, float peso) {

        super(nombre, edad, peso);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
