public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 66.20; //в киллограммах
        double height = 180.50; //в сантиметрах

        double bmi = service.calculate(weight, height);
        System.out.println("Индекс Массы Тела = " + bmi);

        weight = 70.00;
        height = 160.50;
        bmi = service.calculate(weight, height);
        System.out.println("Индекс Массы Тела = " + bmi);

        bmi = service.calculate(60.10, 172.30);
        System.out.println("Индекс Массы Тела = " + bmi);
    }
}
