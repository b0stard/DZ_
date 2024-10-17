import java.util.Scanner;

public class Dz123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество дней в месяце: ");
        int days = scanner.nextInt();

        int Zero = 0;

        System.out.println("Введите температуру для каждого дня:");
        for (int i = 1; i <= days; i++) {
            System.out.print("День " + i + ": ");
            int temperature = scanner.nextInt();

            if (temperature < 0) {
                Zero++;
            }
        }

        System.out.println("Температура опускалась ниже 0 градусов " + Zero + " раз.");

       }

    }

