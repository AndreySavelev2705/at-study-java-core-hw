package homeworks.homework_6.task_2;

import java.util.Random;

public class Chance {
    public static boolean calculateChance(int percent) {
        int randomNum = new Random().nextInt(100) + 1;
        return percent >= randomNum;
    }
}
