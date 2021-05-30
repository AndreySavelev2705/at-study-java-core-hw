package homeworks.homework_2.task_5;

import java.util.Random;

public class TwoDimensionalArray {

    int width = new Random().nextInt(5) + 3; // Ширина
    int height = new Random().nextInt(5) + 3; // Высота

    int twoDimensionalArray[][] = new int[width][height];

    void createTwoDimensionalArray() {

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                twoDimensionalArray[i][j] = new Random().nextInt(2);
            }
        }

        // Получаем случайный индекс для элемента, который был бы не на краю матрицы
        int x = 1 + new Random().nextInt(width - 2);
        int y = 1 + new Random().nextInt(height - 2);
        twoDimensionalArray[x][y] = 2;
    }

    int[][] invertOfTwoDimensionalArrayWhenTwoWasFound(int[][] twoDimensionalArray) {

        boolean flagWas2 = false;
        int[][] newArray = new int[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (twoDimensionalArray[i][j] == 2) {
                    newArray[i][j] = 2;
                    flagWas2 = true;
                    continue;
                } else
                    newArray[i][j] = flagWas2 ? (twoDimensionalArray[i][j] + 1) % 2 : twoDimensionalArray[i][j];
            }
        }

        return newArray;
    }
}