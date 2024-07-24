import java.util.Scanner;

public class PromedioArreglo {

    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        int [] elemento = new int[10];

        for (int i=0; i < elemento.length;i++){
            System.out.println(" Ingrese 10 números enteros: " +(i));
            elemento[i] = leer.nextInt();
        }

        System.out.println("ingrese el número a buscar: " );
        int repetido=0;
        int numeroBuscar = leer.nextInt();

        for (int i=0; i< elemento.length;i++){
            //repetido+=(elemento[i]==numeroBuscar)?1:0;
            if (numeroBuscar==elemento[i]){
                repetido++;
            }

            }


        System.out.println("numero  " + numeroBuscar + " número de veces que está en el arreglo: " +repetido);


    }

}
