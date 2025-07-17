import java.util.Scanner;

public class Adoejercicio178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nota 1: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese nota 2: ");
        int n2 = sc.nextInt();
        System.out.print("Ingrese nota 3: ");
        int n3 = sc.nextInt();

        int suma = 0;
        if (n1 % 2 == 0) suma += n1;
        if (n2 % 2 == 0) suma += n2;
        if (n3 % 2 == 0) suma += n3;

        System.out.println("Suma de los pares: " + suma);
    }
}
