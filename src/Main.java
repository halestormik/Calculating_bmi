public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double Height = 1.90; // рост в метрах
        int Weight = 85; // вес в кг
        int bmi = service.calculate(Height, Weight); // индекс массы тела

        System.out.println(bmi);
    }
}