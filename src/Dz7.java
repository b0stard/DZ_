

import java.util.Scanner;

public class Dz7 {
    public static void main(String[] args) {
        for (int i = 100; i < 500; i++) {
            System.out.println(i);
        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение a: ");
        int a = scanner.nextInt();

        System.out.print("Введите значение b: ");
        int b = scanner.nextInt();

        int sum = 0;


        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }

        System.out.println("Сумма чисел от " + a + " до " + b + " равна: " + sum);

    }
}
