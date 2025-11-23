/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopilotoobjetos;

/**
 *
 * @author ivanp
 */
public class Bicicleta {
    //Atributo
    private int ruedas;
    private String manillar;
    private String pedales;
    private String frenos;
    // Atributo estatico que pertenece a la clase.
    private boolean estaPedaleando;
    
    private static int numBicicletas = 0;
    
    //(Atributos de otra clase)
    private Ciclista ciclista;
    //Constructores
    public Bicicleta(){
        this.ruedas= 0;
        this.pedales="";
        this.manillar="";
        this.frenos="";
        this.estaPedaleando=false;
        // Cada vez que se crea una bici incremente el numero en 1.
        incrementoBici();
    }
    public Bicicleta(int ruedas,String manillar, String pedales, String frenos, boolean estaPedaleando ){
        this.ruedas=ruedas;
        this.manillar=manillar;
        this.frenos=frenos;
        this.pedales=pedales;
        this.estaPedaleando=estaPedaleando;
        // Cada vez que se crea una bici incremente el numero en 1.
        incrementoBici();
    }
    //Getters y Setters
    public void setRuedas(int ruedas){
    this.ruedas=ruedas;
    }
    public int getRuedas(){
    return this.ruedas;
    }
    public void setManillar(String manillar){
    this.manillar=manillar;
    }
    public String getManillar(){
    return this.manillar;
    }
    public void setFrenos(String frenos){
    this.frenos=frenos;
    }
    public String getFrenos(){
    return this.frenos;
    }
    public void setPedales(String pedales){
    this.pedales=pedales;
    }
    public String getPedales(){
    return this.pedales;
    }
    public void setEstaPedaleando(boolean estaPedaleando){
        this.estaPedaleando=estaPedaleando;
    }
    public boolean getEstaPedaleando(){
        return this.estaPedaleando; 
    }
    
    public int getNumBicicletas(){
    return numBicicletas;
    }
    //Metodos
    private static void incrementoBici(){
    numBicicletas++;
    }
    //To String
    @Override
    public String toString(){
        return "Mi bicicleta tiene " + this.ruedas + " ruedas " +
                ", un manillar" + this.manillar +
                " unos pedales " + this.pedales +
                " , unos frenos" + this.frenos +
                " per , ¿Estoy pedaleando?" + this.estaPedaleando;
    }
}
