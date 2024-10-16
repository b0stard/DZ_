public class Dz23 {
    public static void main(String[] args) {
        double beggining = 10.0;
        double total = 0.0;
for (int i = 0;i<=7;i++){
    total+=beggining;
    beggining *=1.1;
       }
        System.out.println("Общее расстояние, пройденное за 7 дней: " + total+ " км");
    }
}
