/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopilotoobjetos;

/**
 * Este sera nuestro objeto en cuestion, el coche.
 *
 */
public class Coche {
    // Atributos

    private String ruedas;  // Los atributos nunca se inicializan en los objetos.
    // Y siempre son privados, protegen a los atributos para que no sean accesibles en otras clases.
    private String suspension;

    private int espejos;

    // Constructores, permiten crear nuestros objetos. Existen dos , el por defecto y el parametrizado.
    // Por defecto:
    public Coche() {
        this.ruedas = ""; // se inicializa el objeto con los atributos basicos, si es un String es "" , si es int o float 0
        this.suspension = "";
        this.espejos = 0;

        // Constructor parametrizado , nosotros le insertamos los atributos.
    }

    public Coche(String ruedas, String suspension, int espejos) {

        this.ruedas = ruedas;
        this.suspension = suspension;
        this.espejos = espejos;

    }

    // Getters(get) y Setters(set)
    public String getRuedas() {

        return this.ruedas;
    }

    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }

    public String getSuspension() {

        return this.suspension;
    }

    public void setSuspension(String suspension) {

        this.suspension = suspension;
    }

    public int getEspejos() {

        return this.espejos;
    }

    public void setEspejos(int espejos) {

        this.espejos = espejos;
    }
// Como llamar a otros metodos
public void acelerar(){

    System.out.println("Acelerando coche brbr");
}
public void frenar(){

    System.out.println("frenando coche ");
}
public void girar(){

    System.out.println("nofuimo");
}

//To string
    @Override
    public String toString() {

        return "mi coche tiene ruedas" + this.ruedas + "suspension" + this.suspension + "espejos" + this.espejos;

    }
}
