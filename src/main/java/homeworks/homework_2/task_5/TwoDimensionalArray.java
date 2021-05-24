package homeworks.homework_2.task_5;

import java.util.Random;

public class TwoDimensionalArray {

    int nArg1 = new Random().nextInt(5)+3;
    int nArg2 = new Random().nextInt(5)+3;

    int twoDimensionalArray[][] = new int[nArg1][nArg2];

    void createTwoDimensionalArray() {

        for (int i = 0; i < nArg1; i++) {
            for (int j = 0; j < nArg2; j++) {
                twoDimensionalArray[i][j] = new Random().nextInt(10);
            }
        }
    }
}
