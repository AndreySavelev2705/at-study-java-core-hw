package homeworks.homework_2.task_8;

import java.sql.SQLOutput;

public class ApplicationNumberWithSwitch {
    public static void main(String[] args) {

        NumberWithSwitch numberWithSwitch = new NumberWithSwitch();
        numberWithSwitch.getCharAWithBreak(-1);
        System.out.println();
        numberWithSwitch.getCharAWithBreak(2);
        System.out.println();
        numberWithSwitch.getCharAWithBreak(4);
        System.out.println();
        numberWithSwitch.getCharAWithBreak(7);
        System.out.println();
        numberWithSwitch.getCharAWithBreak(0);
        System.out.println();
        System.out.println();
        numberWithSwitch.getCharAWithReturn(-1);
        System.out.println();
        numberWithSwitch.getCharAWithReturn(2);
        System.out.println();
        numberWithSwitch.getCharAWithReturn(4);
        System.out.println();
        numberWithSwitch.getCharAWithReturn(7);
        System.out.println();
        numberWithSwitch.getCharAWithReturn(0);
        System.out.println();
    }
}
