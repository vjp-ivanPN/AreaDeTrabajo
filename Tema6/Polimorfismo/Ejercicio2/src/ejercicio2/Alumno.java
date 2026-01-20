package ejercicio2;

// Lo primero sera crear la clase padre persona
public class Alumno extends Persona {

   private String grupo;

    public Alumno() {
        super();
        this.grupo = "";
    }

    public Alumno(String grupo, String nombre) {

        super(nombre);
        this.grupo = grupo;

    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    void saludar() {
        System.out.println("Hola soy "+getNombre()+" del grupo " + grupo);
    
    }
    
    
}
