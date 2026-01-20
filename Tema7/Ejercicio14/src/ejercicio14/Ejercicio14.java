/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
//IMPORTANTE!!!!!
// He tenido varios problemas a la hora de realizar este ejercicio, como por ahora no se como solucionarlos voy a seguir haciendo otros.
// Cuando consigua que funcione esto , borrare estos comentarios.
public class Ejercicio14 {
    //Semana = j;
    public final static int SEMANA = 4;
    //Dias = i;
    public final static int DIAS = 7;

    public static void main(String[] args) {

        //Primero creo el array de Strings con sus valores introducidos ya , lo que me dara el nombre del dia en el que me encuentro
        // Y creare una matriz en la que las filas sean los dias y las columnas los meses por lo que sera un 12x28
        int[][] temperatura = new int[DIAS][SEMANA];
        String[] diaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        System.out.println("Tenemos un total de " + DIAS + "Dias" + SEMANA + "Dia de la Semana");

        // A continuacion creo le introduzco el valor a la matriz, para poder moverme por esta necesitare
        // Crear un for para moverme por las filas y un for anidado para moverme por las columnas.
    Menu.menu(temperatura, diaSemana);
    }

}
