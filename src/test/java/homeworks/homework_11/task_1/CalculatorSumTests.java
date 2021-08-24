package homeworks.homework_11.task_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorSumTests {

    @Test
    @DisplayName("Проверка метода суммирования")
    public void calculateSumTest() {
        int sum = Calculator.getSum(5, 3);

        Assertions.assertEquals(8, sum);

        sum = Calculator.getSum(1, 2, 3, 4, 5, 6);

        Assertions.assertEquals(21, sum);
    }
}
