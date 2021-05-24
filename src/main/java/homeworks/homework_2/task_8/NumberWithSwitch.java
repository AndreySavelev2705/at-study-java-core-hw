package homeworks.homework_2.task_8;

public class NumberWithSwitch {

    void getCharAWithBreak(int nArg) {
        switch (nArg) {
            case 1: case 2: case  3: case 4:
                for (int i = 0; i < nArg; i++) {
                    System.out.print('A');
                }
                break;
            default:
                for (int i = 0; i < 5; i++) {
                    System.out.print('A');
                }
        }
    }

    void getCharAWithReturn(int nArg) {
        switch (nArg) {
            case 1: case 2: case  3: case 4:
                for (int i = 0; i < nArg; i++) {
                    System.out.print('A');
                }
                return;
            default:
                for (int i = 0; i < 5; i++) {
                    System.out.print('A');
                }
        }
    }
}
