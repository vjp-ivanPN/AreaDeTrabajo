/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

public class Trabajador {
    
    private float horas ;
    private float tarifa;
    private String nombre;
    // Aqui empiezo a crear los constructores empezando por los no parametrizados y a continuacion los parametrizados
    public Trabajador(){
        this.horas=0.0f;
        this.tarifa=0.0f;
        this.nombre="";
    }
    public Trabajador(float horas, float tarifa, String nombre){
        this.horas=horas;
        this.tarifa=tarifa;
        this.nombre=nombre;
    }
   
// A continuacion Creo los Getters y los Setters de cada uno de los distintos atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setHoras(float horas) {
        this.horas = horas;
    }
    public float getHoras() {
        return horas;
    }
    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }
    public float getTarifa() {
        return tarifa;
    }
    @Override
    public String toString() {
        return super.toString("Elempleado " + nombre + " Traba un total de "+ horas + " y cada hora le da un beneficio de " + tarifa);
    }
    
    
    
}
