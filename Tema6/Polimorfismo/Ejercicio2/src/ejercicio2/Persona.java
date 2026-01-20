/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

abstract class Persona {

    private String nombre;

// A continuacion creo los constructores , sin parametros y por defecto
    public Persona() {

        this.nombre = "";
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    abstract void saludar();

    @Override
    public String toString() {
        return "Hola me llamo " + nombre;
    }
    
    
}
