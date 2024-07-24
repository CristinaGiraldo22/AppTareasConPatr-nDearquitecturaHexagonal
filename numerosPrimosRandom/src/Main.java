import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño del array
        System.out.print("Ingrese el tamaño del array: ");
        int tamaño = scanner.nextInt();

        // Crear el array con el tamaño proporcionado por el usuario
        int[] numerosPrimos = generarNumerosPrimos(tamaño);

        // Encontrar el número mayor en el array
        int mayor = encontrarMayor(numerosPrimos);

        // Mostrar el array generado y el número mayor
        System.out.println("Array de números primos:");
        mostrarArray(numerosPrimos);
        System.out.println("El mayor número primo es: " + mayor);

        scanner.close();
    }

    // Método para generar un array de números primos
    public static int[] generarNumerosPrimos(int tamaño) {
        int[] array = new int[tamaño];
        Random random = new Random();

        int indice = 0;
        while (indice < tamaño) {
            int numero = random.nextInt(100) + 1; // Generar número aleatorio entre 1 y 100

            // Si el número generado es primo, agregarlo al array
            if (esPrimo(numero)) {
                array[indice] = numero;
                indice++;
            }
        }
        return array;
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método para encontrar el número mayor en un array
    public static int encontrarMayor(int[] array) {
        int mayor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }

    // Método para mostrar un array
    public static void mostrarArray(int[] array) {
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}