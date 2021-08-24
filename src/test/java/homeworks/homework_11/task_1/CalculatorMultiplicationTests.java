package homeworks.homework_11.task_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorMultiplicationTests {

    @Test
    @DisplayName("Проверка метода умножения")
    public void calculateMultiplicationTest() {
        int product = Calculator.getMultiplication(3, 2);

        Assertions.assertEquals(6, product);

        product = Calculator.getMultiplication(1, 2, 3, 4, 5, 6 );

        Assertions.assertEquals(720, product);
    }
}
