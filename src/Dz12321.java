import java.util.Scanner;

public class Dz12321 {
    public static void main(String[] args) {
        int num = 1;
        for (int i =8;i<15;i++){
            num*=i;
        }
        System.out.println("произведение чисел от 8 до 15:" + num);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение a: ");
        int a = scanner.nextInt();

        System.out.print("Введите значение b (b > a): ");
        int b = scanner.nextInt();

        if (b <=a){
            System.out.println("Ошибка.число должно быть больше a");
            return;
        }
        long numbers = 1;

        for (int i = a;i <=b;i++){
            numbers *=i;
        }
        System.out.println("Произведение всех целых чисел от " + a + " до " + b + " равно: " + numbers);
    }
}
