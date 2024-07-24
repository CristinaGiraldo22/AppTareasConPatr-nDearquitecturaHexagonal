import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int [] obtenerElementos = new int[6];
        int mayor=0;
        int menor = 0;
        int suma = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i=0; i < obtenerElementos.length; i++){
            System.out.println(" ingrese 6 números enteros: "+ (i));
            obtenerElementos[i]= scanner.nextInt();
        }

        for (int i=0; i<obtenerElementos.length; i++){
            mayor=(obtenerElementos[mayor]>obtenerElementos[i])? mayor: i;
            menor=!(obtenerElementos[mayor]>obtenerElementos[i])? menor: i;
            suma+=obtenerElementos[i];

        }

        System.out.println(" el mayor es: " + obtenerElementos[mayor]+ " y el número menor es: " + obtenerElementos[menor] );
        System.out.println("la suma de los elemntos es: "+suma);

    }
}