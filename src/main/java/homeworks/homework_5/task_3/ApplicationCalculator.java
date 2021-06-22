package homeworks.homework_5.task_3;

import java.util.Random;

public class ApplicationCalculator {
    public static void main(String[] args) {
        int total = new Random().nextInt(501) + 500;

        int countArithmeticExceptionByZero = 0;

        for (int i = 0; i < total; i++) {
            int n = new Random().nextInt(5);
            int m = new Random().nextInt(5);
            try {
                int result = m / n;
            } catch (ArithmeticException ae) {
                countArithmeticExceptionByZero++;
            }
        }

        System.out.printf("Из %d операций деления %d было выполнено с ошибкой", total, countArithmeticExceptionByZero);
    }
}
