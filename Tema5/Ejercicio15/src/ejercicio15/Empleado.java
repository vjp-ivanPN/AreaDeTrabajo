
package ejercicio15;
// Esta clase creara un objeto empleado , en el que se guardaran los siguientes atributos.
// Nombre Salario y Direccion-->Direccion por su parte es otro objeto, el cual crearemos en su propia clase Direccion.// Esta clase creara un objeto empleado , en el que se guardaran los siguientes atributos.
// Nombre Salario y Direccion-->Direccion por su parte es otro objeto, el cual crearemos en su propia clase Direccion.
public class Empleado {
    private String nombre;
    private int sueldo;
    //Para no hacerme un lio, prefiero crear el atributo direccion mas adelante.
  
   // A continuacion creo los constructores, primero el no parametrizado 
    
   public Empleado(){
   this.nombre="";
   this.sueldo=0;
 
   }
   
   //Luego el parametrizado
   
   public Empleado(String nombre, int sueldo){
   this.nombre=nombre;
   this.sueldo=sueldo;
   }
   
   // A continuacion creo los Setters

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
  
   }
   
     public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
   //Y ahora los Getters.
   
    public String getNombre() {
        return nombre;
    }

    public int getSueldo() {
        return sueldo;
    }
   

}
