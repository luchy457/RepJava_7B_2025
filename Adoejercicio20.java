public class Adoejercicio20 {
    public static void main(String[] args) {
        int i = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        do {
            int num = (int)(Math.random() * 100);
            System.out.println("Número " + (i + 1) + ": " + num);

            if (num > max) max = num;
            if (num < min) min = num;

            i++;
        } while (i < 10);

        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }
}
