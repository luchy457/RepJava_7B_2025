import java.util.Scanner;

public class Adoejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del mes: ");
        String mes = sc.next().toLowerCase();

        int dias;

        switch (mes) {
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                dias = 30;
                break;
            case "febrero":
                dias = 28;
                break;
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                dias = 31;
                break;
            default:
                System.out.println("Mes inválido.");
                return;
        }

        System.out.println("El mes " + mes + " tiene " + dias + " días.");
    }
}
