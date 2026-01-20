/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Alumno alumno1= new Alumno("2A","Pepe");
        Profesor profesor1= new Profesor("matematico","x264");
        alumno1.saludar();
        profesor1.saludar();
        System.out.println("---------------------");
        System.out.println("A continuacion todos somos personas");
        Persona alumno2= new Alumno("1B","Maricarmen");
        Persona profesor2= new Profesor("Taxidermista","Chifuru");
        alumno2.saludar();
        profesor2.saludar();
    }
    
}
