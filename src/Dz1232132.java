import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dz1232132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> distances = new ArrayList<>();

        System.out.print("Введите расстояния от Москвы до городов в км (через пробел): ");
        String input = scanner.nextLine();

        String[] distanceStrings = input.split(" ");

        for (String distanceString : distanceStrings) {
            try {
                double distance = Double.parseDouble(distanceString);
                distances.add(distance);
            } catch (NumberFormatException e) {
                System.err.println("Неверный ввод.Введите числа через пробел.");
                return;
            }
        }

        if(distances.isEmpty()){
            System.out.println("Список расстояний пуст.");
            return;
        }

        double maxDistance = distances.get(0);
        for (int i = 1; i < distances.size(); i++) {
            if (distances.get(i) > maxDistance) {
                maxDistance = distances.get(i);
            }
        }

        System.out.println("Расстояние до самого удаленного города: " + maxDistance + " км");
    }
}
