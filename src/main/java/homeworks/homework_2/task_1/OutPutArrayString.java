package homeworks.homework_2.task_1;

public class OutPutArrayString {
    String[] stringArray = new String[]{"Пятница", "это", "лучший", "день", "недели"};

    public OutPutArrayString() {
    }

    void outPutTheStringByCycleFor(String[] stringArray) {
        for(int i = 0; i < stringArray.length; ++i) {
            if (i == stringArray.length - 1) {
                System.out.printf("%s.", stringArray[i]);
            } else {
                System.out.printf("%s ", stringArray[i]);
            }
        }

    }

    void outPutTheStringByCycleForeach(String[] stringArray) {
        int index = 0;
        String[] var3 = stringArray;
        int var4 = stringArray.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String str = var3[var5];
            if (index == stringArray.length - 1) {
                System.out.printf("%s.", str);
            } else {
                System.out.printf("%s ", str);
            }

            ++index;
        }

    }

    void outPutTheStringByCycleWhile(String[] stringArray) {
        for(int index = 0; index != stringArray.length; ++index) {
            if (index == stringArray.length - 1) {
                System.out.printf("%s.", stringArray[index]);
            } else {
                System.out.printf("%s ", stringArray[index]);
            }
        }

    }
}
