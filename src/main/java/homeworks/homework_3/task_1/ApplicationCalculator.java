package homeworks.homework_3.task_1;

public class ApplicationCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(4, 2));
        System.out.println(calculator.subtract(5, 3));
        System.out.println(calculator.multiply(2, 6));
        System.out.println(calculator.divide(5, 3));
    }
}
