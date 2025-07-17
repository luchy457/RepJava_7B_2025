import java.util.Scanner;

public class Adoejercicio17b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nota 1: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese nota 2: ");
        int n2 = sc.nextInt();
        System.out.print("Ingrese nota 3: ");
        int n3 = sc.nextInt();

        int[] notas = {n1, n2, n3};
        int suma = 0;

        for (int nota : notas) {
            suma += (nota % 2 == 0) ? nota : 0;
        }

        System.out.println("Suma de los pares: " + suma);
    }
}
