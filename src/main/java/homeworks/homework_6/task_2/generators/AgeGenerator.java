package homeworks.homework_6.task_2.generators;

import java.util.Random;

public class AgeGenerator {
    public static int generate() {
        return new Random().nextInt(56) + 20;
    }
}
