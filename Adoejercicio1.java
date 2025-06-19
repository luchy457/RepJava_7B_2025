import java.util.Scanner;

public class Adoejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota1 = pedirNota(scanner, "Ingrese nota 1: ");
        int nota2 = pedirNota(scanner, "Ingrese nota 2: ");
        int nota3 = pedirNota(scanner, "Ingrese nota 3: ");

        int promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("Promedio: " + promedio);
        if (promedio >= 7) {
            System.out.println("AprobAdo");
        } else {
            System.out.println("ReprobAdo");
        }

        scanner.close();
    }

    // Método que pide una nota válida entre 0 y 10
    private static int pedirNota(Scanner scanner, String mensaje) {
        int nota;
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                nota = scanner.nextInt();
                if (nota >= 0 && nota <= 10) {
                    return nota;
                } else {
                    System.out.println("La nota debe estar entre 0 y 10.");
                }
            } else {
                System.out.println("Entrada inválida. Ingrese un número entero.");
                scanner.next(); // limpiar entrada inválida
            }
        }
    }
}


