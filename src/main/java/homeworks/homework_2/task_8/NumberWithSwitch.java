package homeworks.homework_2.task_8;

public class NumberWithSwitch {
    public NumberWithSwitch() {
    }

    void getCharAWithBreak(int nArg) {
        int i;
        switch(nArg) {
        case 1:
        case 2:
        case 3:
        case 4:
            for(i = 0; i < nArg; ++i) {
                System.out.print('A');
            }

            return;
        default:
            for(i = 0; i < 5; ++i) {
                System.out.print('A');
            }

        }
    }

    void getCharAWithReturn(int nArg) {
        int i;
        switch(nArg) {
        case 1:
        case 2:
        case 3:
        case 4:
            for(i = 0; i < nArg; ++i) {
                System.out.print('A');
            }

            return;
        default:
            for(i = 0; i < 5; ++i) {
                System.out.print('A');
            }

        }
    }
}
