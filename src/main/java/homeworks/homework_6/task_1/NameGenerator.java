package homeworks.homework_6.task_1;

import java.util.Random;

public class NameGenerator {
    private static final String RUS_SMALL = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static final String RUS_BIG = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public static String generate() {
        String name = "";
        int stringLength = new Random().nextInt(8) + 5;

        for (int i = 0; i < stringLength; i++) {
            int index = new Random().nextInt(33);
            if (i == 0) {
                name += RUS_BIG.charAt(index);
                continue;
            }
            name += RUS_SMALL.charAt(index);
        }
        return name;
    }
}
