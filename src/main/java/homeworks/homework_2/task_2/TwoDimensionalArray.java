package homeworks.homework_2.task_2;

public class TwoDimensionalArray {
    int[][] twoDimensionalArray = new int[8][8];

    public TwoDimensionalArray() {
    }

    void createTwoDimensionalArray() {
        for(int i = 0; i < this.twoDimensionalArray.length; ++i) {
            for(int j = 0; j < this.twoDimensionalArray.length; ++j) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        this.twoDimensionalArray[i][j] = 0;
                    } else {
                        this.twoDimensionalArray[i][j] = 1;
                    }
                } else if (j % 2 == 0) {
                    this.twoDimensionalArray[i][j] = 1;
                } else {
                    this.twoDimensionalArray[i][j] = 0;
                }
            }
        }

    }

    void outPutTwoDimensionalArrayByCycleFor(int[][] twoDimensionalArray) {
        for(int i = 0; i < twoDimensionalArray.length; ++i) {
            System.out.println();

            for(int j = 0; j < twoDimensionalArray.length; ++j) {
                System.out.print(twoDimensionalArray[i][j] + " ");
            }
        }

    }

    void outPutTwoDimensionalArrayByCycleForeach(int[][] twoDimensionalArray) {
        int[][] var2 = twoDimensionalArray;
        int var3 = twoDimensionalArray.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int[] array = var2[var4];
            System.out.println();
            int[] var6 = array;
            int var7 = array.length;

            for(int var8 = 0; var8 < var7; ++var8) {
                int element = var6[var8];
                System.out.print(element + " ");
            }
        }

    }

    void outPutTwoDimensionalArrayByCycleWhile(int[][] twoDimensionalArray) {
        for(int i = 0; i < twoDimensionalArray.length; ++i) {
            int j = 0;
            System.out.println();

            while(j < twoDimensionalArray.length) {
                System.out.print(twoDimensionalArray[i][j] + " ");
                ++j;
            }
        }

    }
}
