import java.util.Scanner;

public class Adoejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del mes: ");
        String mes = sc.next().toLowerCase();

        int dias;
        if (mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre") || mes.equals("noviembre"))
            dias = 30;
        else if (mes.equals("febrero"))
            dias = 28;
        else
            dias = 31;

        System.out.println("El mes " + mes + " tiene " + dias + " días.");
    }
}

