import java.util.Scanner;

public class MaxMinParImparArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor en la posición " + i + ": ");
            arreglo[i] = scanner.nextInt();
        }

        int maximo = arreglo[0];
        int minimo = arreglo[0];

        for (int i = 1; i < n; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < n; i++) {
            if (arreglo[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("El máximo valor en el arreglo es: " + maximo);
        System.out.println("El mínimo valor en el arreglo es: " + minimo);
        System.out.println("Cantidad de valores pares en el arreglo: " + pares);
        System.out.println("Cantidad de valores impares en el arreglo: " + impares);

        scanner.close();
    }
}
