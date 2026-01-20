/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

public abstract class Animales {
    // Defino los atributos de mi objeto Animales   

    private String nombre;
    private int edad;
    private float peso;
//Creo mi constructor por defecto    

    public Animales() {

        this.nombre = "";
        this.edad = 0;
        this.peso = 0.0f;
    }
    // Creo mi constructor parametrizado

    public Animales(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;

    }
// A continuacion creo todos los getters y setters.

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setPeso(float peso) {

        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    // A continuacion tenemos que crear los metodos abstractos referidos a Animal.
    public abstract void sonido();

    public abstract void alimentacion();

    public abstract void habitat();

    public abstract void nombreCientifico();

    @Override
    public String toString() {
        return "Este animal se llama " + nombre + " tiene una edad de " + edad +" y un peso de "+ peso ;
    }
}
