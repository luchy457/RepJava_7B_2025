import javax.swing.*;
import java.util.Scanner;

public class Adoejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            // Mostrar imagen ado2.jpg para números pares
            ImageIcon adoImagenPar = new ImageIcon("ado2.jpg");
            JOptionPane.showMessageDialog(null,
                    numero + " es par.",
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE,
                    adoImagenPar);
        } else {
            // Mostrar imagen ado.jpg para números impares
            ImageIcon adoImagenImpar = new ImageIcon("ado.jpg");
            JOptionPane.showMessageDialog(null,
                    numero + " es impar.",
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE,
                    adoImagenImpar);
        }

        scanner.close();
    }
}




