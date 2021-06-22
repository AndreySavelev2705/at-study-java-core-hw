package homeworks.homework_6.task_4;

import java.util.Random;

public class NameGenerator {
    private static String ENG_SMALL = "abcdefghijklmnopqrstuvwxyz";
    private static String ENG_BIG = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String generate() {
        int length = new Random().nextInt(8) + 5;
        String result = "";

        for (int i = 0; i < length; i++) {
            int index = new Random().nextInt(26);
            if (i == 0) {
                result += ENG_BIG.charAt(index);
                continue;
            }
            result += ENG_SMALL.charAt(index);
        }

        return result;
    }
}
