package homeworks.homework_2.task_1;

import java.sql.SQLOutput;

public class ApplicationOutPutArrayString {
    public static void main(String[] args) {
        OutPutArrayString outPutArrayString = new OutPutArrayString();

        outPutArrayString.outPutTheStringByCycleFor(outPutArrayString.stringArray);
        System.out.println();
        outPutArrayString.outPutTheStringByCycleForeach(outPutArrayString.stringArray);
        System.out.println();
        outPutArrayString.outPutTheStringByCycleWhile(outPutArrayString.stringArray);
    }
}
