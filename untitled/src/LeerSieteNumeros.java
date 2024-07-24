import java.util.Scanner;

public class LeerSieteNumeros {

    public static void main(String[] args){



        int[] numeros = llenarArreglo();
        double promedioPositivos = calcularPromedioPositivos(numeros);
        double promedioNegativos = calcularPromedioNegativos(numeros);
        int contadorCeros = contarCeros(numeros);

        System.out.println("Promedio positivo: " + promedioPositivos);
        System.out.println("Promedio negativos: " + promedioNegativos);
        System.out.println("Contador de ceros: " + contadorCeros);

    }
    public static int[] llenarArreglo(){ // sin dato de entrada
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[7];
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("Ingrese el número: " + (i));
            arreglo[i] = scanner.nextInt();
        }
        int i = 0;
        while (i < arreglo.length){
            System.out.println("Ingrese el número: " + (i));
            arreglo[i] = scanner.nextInt();
            i++;
        }
        return arreglo;
    }
    public static double calcularPromedioPositivos(int[] arreglo){
        double sumaPositivos = 0;
        double contadorPositivo = 0;
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] > 0) {
                sumaPositivos += arreglo[i];
                contadorPositivo++;
            }
        }
        return sumaPositivos / contadorPositivo; // dato de salida
    }

    public static double calcularPromedioNegativos(int[] arreglo){
        double sumaNegativos = 0;
        double contadorNegativos = 0;
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] < 0){
                sumaNegativos += arreglo[i];
                contadorNegativos++;
            }
        }
        return sumaNegativos / contadorNegativos;
    }

    public static int contarCeros(int[] arreglo){
        int contadorCeros = 0;
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] == 0){
                contadorCeros++;
            }
        }
        return contadorCeros;
    }
}