import java.util.Scanner;

public class Adoejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese posición: ");
        int pos = sc.nextInt();

        if (pos == 1)
            System.out.println("Medalla de oro");
        else if (pos == 2)
            System.out.println("Medalla de plata");
        else if (pos == 3)
            System.out.println("Medalla de bronce");
        else
            System.out.println("Siga participando");
    }
}
