import java.util.Scanner;

public class Adoejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un carácter: ");
        char c = sc.next().toLowerCase().charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println(c + " es una vocal.");
        } else {
            System.out.println(c + " no es una vocal.");
        }
    }
}
