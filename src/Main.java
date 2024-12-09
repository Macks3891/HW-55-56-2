public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int numerator = 10;
        int denominator = 0;

        try {
            double result = Division.divide(numerator, denominator);
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Вариант 2: Обработка исключения в месте вызова метода (повторно)
        try {
            double result = Division.divide(numerator, denominator);
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void task2() {
        CarService carService = new CarService();

        try {
            Car car = carService.getCar("Toyota", "Corolla", 2020);
            System.out.println("Найдена машина: " + car);
        } catch (CarNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Car car = carService.getCar("Tesla", "Model S", 2022);
            System.out.println("Найдена машина: " + car);
        } catch (CarNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void task3() {
        String[] passwords = {
                "MyPassword123",
                "ffffff66",
                "ShlechtPass",
                "aSdf3h",
                "avalanche gt2020"
        };

        for (String password : passwords) {
            String result = PasswordValidator.validatePassword(password);
            System.out.println(result);
        }
    }
}
