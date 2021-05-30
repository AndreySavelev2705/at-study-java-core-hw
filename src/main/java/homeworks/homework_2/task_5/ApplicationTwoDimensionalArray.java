package homeworks.homework_2.task_5;

public class ApplicationTwoDimensionalArray {
    public static void main(String[] args) {

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        twoDimensionalArray.createTwoDimensionalArray();

        for (int i = 0; i < twoDimensionalArray.nArg1; i++) {
            for (int j = 0; j < twoDimensionalArray.nArg2; j++) {
                System.out.print(twoDimensionalArray.twoDimensionalArray[i][j]);
            }
            System.out.println();
        }
    }
}