public class Dz213 {
    public static void main(String[] args) {
        System.out.println("Таблица соответствия фунтов и килограммов:");
        System.out.println("Фунты\tКилограммы");
        System.out.println("-----\t-------");
        for (int i =1;i <=10;i++){
            double kilograms = i * 0.453592;
            System.out.println(i + "\t\t" + String.format("%.2f", kilograms));
        }
    }
}
