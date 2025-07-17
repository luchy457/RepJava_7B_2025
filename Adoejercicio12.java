import java.util.Scanner;

public class Adoejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        if (numero >= 1 && numero <= 12) {
            System.out.println("Pertenece a la primera docena.");
        } else if (numero >= 13 && numero <= 24) {
            System.out.println("Pertenece a la segunda docena.");
        } else if (numero >= 25 && numero <= 36) {
            System.out.println("Pertenece a la tercera docena.");
        } else {
            System.out.println("El número " + numero + " está fuera de rango.");
        }
    }
}
