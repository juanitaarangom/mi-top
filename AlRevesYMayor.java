import java.util.Scanner;

public class AlRevesYMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int mayor = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            if (i == 0 || numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.print("Numeros al reves: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
        System.out.println("El mayor es: " + mayor);
    }
}
