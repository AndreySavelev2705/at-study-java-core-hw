package homeworks.homework_2.task_2;

import java.sql.SQLOutput;

public class ApplicationTwoDimensionalArray {
    public static void main(String[] args) {

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        twoDimensionalArray.createTwoDimensionalArray();

        twoDimensionalArray.outPutTwoDimensionalArrayByCycleFor(twoDimensionalArray.twoDimensionalArray);
        System.out.println();
        twoDimensionalArray.outPutTwoDimensionalArrayByCycleForeach(twoDimensionalArray.twoDimensionalArray);
        System.out.println();
        twoDimensionalArray.outPutTwoDimensionalArrayByCycleWhile(twoDimensionalArray.twoDimensionalArray);
    }
}
