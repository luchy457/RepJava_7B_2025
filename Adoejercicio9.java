import java.util.Scanner;

public class Adoejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0 = piedra, 1 = papel, 2 = tijera");

        System.out.print("Jugador 1: ");
        int j1 = sc.nextInt();
        System.out.print("Jugador 2: ");
        int j2 = sc.nextInt();

        if (j1 == j2) {
            System.out.println("Empate");
        } else if ((j1 == 0 && j2 == 2) ||
                   (j1 == 1 && j2 == 0) ||
                   (j1 == 2 && j2 == 1)) {
            System.out.println("Jugador 1 gana");
        } else {
            System.out.println("Jugador 2 gana");
        }
    }
}

