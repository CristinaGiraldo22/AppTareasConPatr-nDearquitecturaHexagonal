import java.util.Scanner;

public class Estudiantes {

    public static void main(String[] args) {
        /*hacer un arreglo de 2 columnas y 3 filas llamado estudiantes
        en donde guardemos el nombre de un estudiante y la cedula (esta va en tipo string)
        ingresados por teclado*/
        Scanner teclado =new Scanner(System.in);
        String [][] estudiantes = new String[3][2];
        int [][] notas = new int [3][4];
        float []promedioNotas= new  float[notas.length];

        ingresarEstudiante(estudiantes);




        for (int i= 0; i<estudiantes.length;i++){
                System.out.println(" Estudiante: "+ estudiantes[i][0] + " Numero de C.C: "+ estudiantes[i][1]);

        }


        /*crear otro arreglo de 3 filas
        y 4 columnas llamado notas
        indicando en la primera posicion de la fila el indice del arreglo de estudiantes
        y en las otras 3 posiciones una nota ingresada por teclado.*/

        for (int e= 0; e < notas.length; e++){
            System.out.println("ingrese las notas para el estudiante : " + estudiantes[e][0] );
            notas[e][0]= e;
            float sumaNotas=0;
            for (int n = 1; n < notas[e].length; n++){
                System.out.println(" ingrese la nota del 1 al 5:   " + n +"!");
                notas[e][n]=teclado.nextInt();
                sumaNotas+=notas[e][n];
            }
            teclado.nextLine();
            promedioNotas[e]= sumaNotas/notas.length;



        }

        //para cada estudiante se debe calcular el promedio



        //mostrar el nombre del estudiante, las notas y el promedio
        for (int e=0; e < estudiantes.length;e++){
            System.out.print("el nombre del estudiante es:  " + estudiantes[e][0] + " la cedula del estudiante es: " + estudiantes[e][1]);
            System.out.println("Notas: " );
            for (int n=1; n<notas[e].length; n++){
                System.out.println(" nota nro" +
                        ": " + n +" Valor de la nota: " +notas[e][n]);

            }
            System.out.println("promedio:" + promedioNotas[e] );
            System.out.println(" ---------------" );
        }

    }
    public static void ingresarEstudiante(String [][] estudiantes){
        Scanner teclado =new Scanner(System.in);
        for (int i = 0; i< estudiantes.length; i++){
            System.out.println(" ingrese el nombre del estudiante: ");
            estudiantes[i][0]= teclado.nextLine();

            System.out.println("ingrese la cedula del estudiante: ");
            estudiantes[i][1]=teclado.nextLine();

        }


        System.out.println("--------Estudiantes  y números de cedula ingresados--------");
    }
}
