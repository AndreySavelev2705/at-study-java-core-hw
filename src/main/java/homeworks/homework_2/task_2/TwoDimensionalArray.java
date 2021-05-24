package homeworks.homework_2.task_2;

public class TwoDimensionalArray {

    int twoDimensionalArray[][] = new int[8][8];

    void createTwoDimensionalArray() {

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray.length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        twoDimensionalArray[i][j] = 0;
                    } else
                        twoDimensionalArray[i][j] = 1;
                } else {
                    if (j % 2 == 0) {
                        twoDimensionalArray[i][j] = 1;
                    } else
                        twoDimensionalArray[i][j] = 0;
                }
            }
        }
    }

    void outPutTwoDimensionalArrayByCycleFor(int twoDimensionalArray[][]) {

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            System.out.println();
            for (int j = 0; j < twoDimensionalArray.length; j++) {
                System.out.print(twoDimensionalArray[i][j] + " ");
            }
        }
    }

    void outPutTwoDimensionalArrayByCycleForeach(int twoDimensionalArray[][]) {

        for (int array[] : twoDimensionalArray) {
            System.out.println();
            for (int element : array) {
                System.out.print(element + " ");
            }
        }
    }

    void outPutTwoDimensionalArrayByCycleWhile(int twoDimensionalArray[][]) {

        int i = 0;
        while (i < twoDimensionalArray.length) {
            int j = 0;
            System.out.println();
            while (j < twoDimensionalArray.length) {
                System.out.print(twoDimensionalArray[i][j] + " ");
                j++;
            }
            i++;
        }
    }

}
