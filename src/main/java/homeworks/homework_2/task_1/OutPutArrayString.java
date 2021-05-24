package homeworks.homework_2.task_1;

public class OutPutArrayString {

    String stringArray[] = {"Пятница", "это", "лучший", "день", "недели"};

    void outPutTheStringByCycleFor(String stringArray[]) {
        for (int i = 0; i < stringArray.length; i++) {
            if (i == stringArray.length - 1) {
                System.out.printf("%s.", stringArray[i]);
            } else System.out.printf("%s ", stringArray[i]);
        }
    }

    void outPutTheStringByCycleForeach(String stringArray[]) {
        int index = 0;

        for (String str : stringArray) {
            if (index == stringArray.length - 1) {
                System.out.printf("%s.", str);
            } else System.out.printf("%s ", str);
            index++;
        }

    }

    void outPutTheStringByCycleWhile(String stringArray[]) {
        int index = 0;

        while (index != stringArray.length) {
            if (index == stringArray.length - 1) {
                System.out.printf("%s.", stringArray[index]);
            } else System.out.printf("%s ", stringArray[index]);
            index++;
        }
    }
}
