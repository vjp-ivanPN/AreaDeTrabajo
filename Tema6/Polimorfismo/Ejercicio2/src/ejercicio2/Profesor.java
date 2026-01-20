/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

public class Profesor extends Persona {

    private String especialidad;

    public Profesor() {
        super();
        this.especialidad = "";

    }

    public Profesor(String especialidad, String nombre) {
        super(nombre);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    void saludar() {
        System.out.println("Soy "+this.getNombre()+", soy profesor y mi especialidad es " + especialidad);
    }
 
}
