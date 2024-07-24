import java.util.Scanner;

public class MultiplicarCadaNumero {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int [] multiplicarElementos = new int[5];


        for (int i=0; i<multiplicarElementos.length;i++){
            System.out.println("Ingrese el número = " + (i));
            multiplicarElementos[i]= leer.nextInt();
        }

        System.out.println(" ingrese el numero a multiplicar: " );
        int numero=leer.nextInt();

        System.out.println(" número que va a multiplicar "+numero);


        for(int i=0; i < multiplicarElementos.length; i++){
            multiplicarElementos[i]*=numero;
            System.out.println(" nmultiplicar "+ multiplicarElementos[i]);
        }
    }

    public static void leerNumeros(int[] multiplicarElementos){

    }
}
