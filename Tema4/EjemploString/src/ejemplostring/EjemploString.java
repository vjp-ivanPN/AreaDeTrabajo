package ejemplostring;

import java.util.Scanner;

public class EjemploString {

    public static void main(String[] args) {
        String nombre;
        nombre = "manolo";

        String apellido = "arsanaliev";

        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cual fué el ultimo trofeo obtenido? ");
        String trofeo = entrada.nextLine();
        System.out.println("Has obtenido " + trofeo);
        if (nombre.equalsIgnoreCase(apellido)) {
            System.out.println("son inguales");

        } else {
            System.out.println("son distintos");
        }
    }

}
