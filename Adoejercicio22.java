public class Adoejercicio22 {
    public static void main(String[] args) {
        int contador = 0;

        while (contador < 10) {
            char categoria = (char)('A' + (int)(Math.random() * 3)); // A, B o C
            int antiguedad = (int)(Math.random() * 21); // 0 a 20 años
            double sueldo = 20000 + Math.random() * 30000; // sueldo entre 20k y 50k

            double aumento = 0;
            if (antiguedad >= 1 && antiguedad <= 5)
                aumento = 0.05;
            else if (antiguedad >= 6 && antiguedad <= 10)
                aumento = 0.10;
            else if (antiguedad > 10)
                aumento = 0.30;

            int plus = 0;
            switch (categoria) {
                case 'A':
                    plus = 1000;
                    break;
                case 'B':
                    plus = 2000;
                    break;
                case 'C':
                    plus = 3000;
                    break;
            }

            double sueldoNeto = sueldo + (sueldo * aumento) + plus;

            System.out.printf("Empleado %d → Categoría: %c | Antigüedad: %d años | Sueldo neto: $%.2f%n",
                    contador + 1, categoria, antiguedad, sueldoNeto);

            contador++;
        }
    }
}

