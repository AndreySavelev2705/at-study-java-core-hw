package homeworks.homework_11.task_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RandomIntegerTest {

    private final int NUMBER_OF_ITERATIONS = 10000;

    @Test
    @DisplayName("Проверка получения рандомного целого числа")
    public void getRandomIntegerTest() {
        for (int i = 0; i < NUMBER_OF_ITERATIONS; i++) {
            int start = new Random().nextInt(100 + 1);
            int end = new Random().nextInt(100 + 1) + 100;
            int random = Generator.randomInteger(start, end);
            //System.out.println(random);

            Assertions.assertEquals(110, random, 50);
        }
    }
}
