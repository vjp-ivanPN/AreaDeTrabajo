/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

public class Ordenador {

    int memoriaRam;
    int memoriaDiscoDuro;
    String modeloProcesador;
    String modeloGrafica;
    float precio;

    //Creo constructores ,sin parametrizar
    public Ordenador() {
        this.memoriaRam = 0;
        this.memoriaDiscoDuro = 0;
        this.modeloGrafica = "";
        this.modeloProcesador = "";
        this.precio = 0.0f;
    }

    // y parametrizados
    public Ordenador(int memoriaRam, int memoriaDiscoDuro, String modeloGrafica, String modeloProcesador, float precio) {
        this.memoriaRam = memoriaRam;
        this.memoriaDiscoDuro = memoriaDiscoDuro;
        this.modeloGrafica = modeloGrafica;
        this.modeloProcesador = modeloProcesador;
        this.precio = precio;
    }
    public int getMemoriaRam() {
        return memoriaRam;
    }
    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    
    public void setMemoriaDiscoDuro(int memoriaDiscoDuro) {
        this.memoriaDiscoDuro = memoriaDiscoDuro;
    }

    public int getMemoriaDiscoDuro() {
        return memoriaDiscoDuro;
    }
    public void setModeloProcesador(String modeloProcesador) {
        this.modeloProcesador = modeloProcesador;
    }

    public String getModeloProcesador() {
        return modeloProcesador;
    }

    public String getModeloGrafica() {
        return modeloGrafica;
    }

    public void setModeloGrafica(String modeloGrafica) {
        this.modeloGrafica = modeloGrafica;
    }
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}
