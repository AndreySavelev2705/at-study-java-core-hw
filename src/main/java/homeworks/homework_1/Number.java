package homeworks.homework_1;

public class Number {

    // Задача № 3
    boolean isTheNumberOddOrEven(int number) {

        boolean result = number % 2 == 0 ? false : true;

        return result;
    }

    // Задача № 4
    int lengthInMeters(int number) {

        int result = number / 100;

        return result;
    }
}
