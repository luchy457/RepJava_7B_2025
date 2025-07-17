import java.util.Scanner;

public class Adoejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese clase de auto (a, b o c): ");
        char clase = sc.next().toLowerCase().charAt(0);

        switch (clase) {
            case 'a':
                System.out.println("4 ruedas y un motor");
                break;
            case 'b':
                System.out.println("4 ruedas, un motor, cierre centralizado y aire");
                break;
            case 'c':
                System.out.println("4 ruedas, un motor, cierre centralizado, aire, airbag");
                break;
            default:
                System.out.println("Clase no válida");
        }
    }
}
