/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23;

public class Taxi extends Vehiculo {
 private int numeroLicencia;
 
 public Taxi(){
     super();
     this.numeroLicencia=0;
 }
 public Taxi(String matricula, String modelo, int potencia, int numeroLicencia){
     super(matricula, modelo, potencia);
     this.numeroLicencia=numeroLicencia;
 }
}
