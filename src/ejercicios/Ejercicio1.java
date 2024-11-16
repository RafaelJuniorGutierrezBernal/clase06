package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int arr[];
        var sc = new Scanner(System.in);

        System.out.println("Digite el tamaño del array: ");
        int size = sc.nextInt();
        arr = new int[size];

        if (size > 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("DIGITE EL NUMERO " + (i + 1) + ":");
                arr[i] = sc.nextInt();
            }
            System.out.println("ARREGLO LLENADO CORRECTAMENTE");
        } else {
            System.err.println("TAMAÑO DE ARRAY INVALIDO (DEBE SER MAYOR A 0)");
        }
        
        sumaArr(arr);
        
        valorMaximo(arr);
        
        valorMinimo(arr);
        
        invertirArr(arr);
       
        mayorMenor(arr);
        
        promedioArr(arr);
        
        modaArr(arr);

        sc.close();
    }

    private static void modaArr(int[] arr) {

        int moda = arr[0];
        int maxFrecuencia = 0;

        for (int i = 0; i < arr.length; i++) {
            int frecuencia = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frecuencia++;
                }
            }

            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                moda = arr[i];
            }
        }
        System.out.println("La moda es: " + moda);
    }

    private static void promedioArr(int[] arr) {
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
        double promedio = (double) suma / arr.length;
        System.out.println("El promedio es: " + promedio);
    }

    private static void mayorMenor(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;

        }
    }

    private static void invertirArr(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("Arreglo invertido: ");
        System.out.println(Arrays.toString(arr));
    }

    private static void valorMinimo(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("El valor minimo es: " + min);
    }

    private static void valorMaximo(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("El valor maximo es: " + max);
    }

    private static void sumaArr(int[] arr) {
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
        System.out.println("La suma de los elementos del array es: " + suma);
    }

}
