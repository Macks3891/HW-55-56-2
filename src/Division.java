public class Division {

    public static double divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return (double) numerator / denominator;
    }
}