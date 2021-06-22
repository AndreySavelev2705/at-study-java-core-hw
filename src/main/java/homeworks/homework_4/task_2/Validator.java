package homeworks.homework_4.task_2;

public class Validator {

    public static void checkTheStringForTheNumberOfSpaces(String stringForCheck) {

        if (!stringForCheck.matches("(^\\w+\\s?\\w+\\s?\\w*)|(^\\s\\s)$")) {
            System.out.println("Колличество пробелов больше чем 2");
        }
    }

    public static String[] splitStringBySpaces(String stringForSplit) {
        String[] stringsArray = stringForSplit.split(" ");
        return stringsArray;
    }

    public static boolean checkIfTheClassIsValid(Human human) {
        if (human.getBirthDay() == null) {
            return false;
        }
        if (human.getFirstName() == null) {
            return false;
        }
        if (human.getSecondName() == null) {
            return false;
        }
        return true;
    }

    public static boolean checkIfTheArrayIsValid(Human[] humans) {
        boolean flag = false;

        for (Human human : humans) {
            if (human == null) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
