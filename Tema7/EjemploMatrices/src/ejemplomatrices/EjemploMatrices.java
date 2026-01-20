package ejemplomatrices;

public class EjemploMatrices {

    public final static int FILAS = 3;
    public final static int COLUMNAS = 6;
// 1-Declarar e inicializar una matriz
    //Filas->Alumnos
    //Columnas==>notas

    /*
                 p   L   B   I   E   S
    Alumnos1--> [3] [6] [7] [8] [9]  [1]
    Alumnos1--> [5] [7] [8] [3] [10] [8]
    Alumnos1--> [2] [6] [5] [9] [9]  [6]
     */
    public static void main(String[] args) {
        
        int[][] notasAlumnos = new int[FILAS][COLUMNAS];
        String[] nombreAsignatura = {"PGR", "LMSGI", "BD", "IPEI", "ED", "SI"};
        System.out.println(notasAlumnos.length + " Filas");
        System.out.println(notasAlumnos[0].length + " Columnas");

        // A continuacion creo los for anidados que usaremos para movernos entre filas y columnas
        // Donde la Fila se expresara con la letra i, y la columna con la letra j 
        // Asi es como 
        for (int i = 0; i < notasAlumnos.length; i++) {
            System.out.println("Notas del alumno " + (i + 1) + ":");

            for (int j = 0; j < notasAlumnos[0].length; j++) {
                notasAlumnos[i][j] = (int) (Math.random() * 11);

            }
        }

        //Mostrar la matriz
        for (int i = 0; i < notasAlumnos.length; i++) {
            System.out.println("Alumno " + (i + 1));

            for (int j = 0; j < notasAlumnos[0].length; j++) {
                System.out.println(nombreAsignatura[j]);
                System.out.println(notasAlumnos[i][j]);
            }
        }

    }
}
