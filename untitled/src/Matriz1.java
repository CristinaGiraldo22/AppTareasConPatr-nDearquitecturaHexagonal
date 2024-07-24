import java.util.Scanner;

public class Matriz1 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);


        System.out.println(" ingrese el número de columnas : ");
        int columnas = leer.nextInt();



        int [][]matriz = new int[2][columnas];
        System.out.println("el tamaño de la matriz en número de fila es: " + matriz.length + " en número de columnas es: " + matriz[0].length);

        for (int i= 0; i < 2;i++){
            for (int j=0; j<columnas;j++){
                System.out.println("Ingrese los valores para la posición i:  "+ (i) + "ingrese los valores de la posición j: " + (j));
                matriz[i][j]=leer.nextInt();
            }
        }
        int sumaPrimeraFila=0;
        int restaSegundaFila=matriz[1][0]*2;
        for (int i= 0; i < 2;i++){
            for (int j=0; j<columnas;j++){
                switch (i){
                    case 0:
                        sumaPrimeraFila+=matriz[0][j];

                    case 1: restaSegundaFila-=matriz[0][j];

                }
            }
        }
        System.out.println("la suma es:  " + sumaPrimeraFila);
        System.out.println("la resta es:  " + restaSegundaFila);
    }
}
