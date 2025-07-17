import java.util.Scanner;

public class Adoejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese categoría (A, B o C): ");
        char categoria = sc.next().toUpperCase().charAt(0);
        System.out.print("Ingrese antigüedad (años): ");
        int antiguedad = sc.nextInt();
        System.out.print("Ingrese sueldo bruto: ");
        double sueldo = sc.nextDouble();

        double aumento = 0;
        if (antiguedad >= 1 && antiguedad <= 5) aumento = 0.05;
        else if (antiguedad >= 6 && antiguedad <= 10) aumento = 0.10;
        else if (antiguedad > 10) aumento = 0.30;

        int plus = 0;
        if (categoria == 'A') plus = 1000;
        else if (categoria == 'B') plus = 2000;
        else if (categoria == 'C') plus = 3000;

        double sueldoNeto = sueldo + (sueldo * aumento) + plus;
        System.out.println("Sueldo neto: $" + sueldoNeto);
    }
}
