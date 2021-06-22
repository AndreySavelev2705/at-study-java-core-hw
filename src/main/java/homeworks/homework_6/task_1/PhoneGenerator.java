package homeworks.homework_6.task_1;

import java.util.Random;

public class PhoneGenerator {
    public static String generate() {
        String phoneNumber = new String();

        for (int i = 0; i < 16; i++) {
            switch (i) {
                case 0:
                    phoneNumber += "+";
                    break;
                case 1:
                    phoneNumber += "7";
                    break;
                case 2:
                    phoneNumber += "(";
                    break;
                case 6:
                    phoneNumber += ")";
                    break;
                case 10:
                case 13:
                    phoneNumber += "-";
                    break;
                default:
                    phoneNumber += new Random().nextInt(10);
                    break;
            }
        }
        return phoneNumber;
    }
}
