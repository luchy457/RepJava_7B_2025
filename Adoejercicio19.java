public class Adoejercicio19 {
    public static void main(String[] args) {
        int i = 0, suma = 0;

        while (i < 10) {
            int num = (int)(Math.random() * 100); // entre 0 y 99
            System.out.println("Número " + (i + 1) + ": " + num);
            suma += num;
            i++;
        }

        double promedio = suma / 10.0;
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
