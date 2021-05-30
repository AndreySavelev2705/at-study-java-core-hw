package homeworks.homework_2.task_5;

public class ApplicationTwoDimensionalArray {
    public static void main(String[] args) {

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        twoDimensionalArray.createTwoDimensionalArray();

        for (int i = 0; i < twoDimensionalArray.width; i++) {
            for (int j = 0; j < twoDimensionalArray.height; j++) {
                System.out.print(twoDimensionalArray.twoDimensionalArray[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        int[][] tDArray = twoDimensionalArray.invertOfTwoDimensionalArrayWhenTwoWasFound(twoDimensionalArray.twoDimensionalArray);

        for (int i = 0; i < tDArray.length; i++) {
            for (int j = 0; j < tDArray[0].length; j++) {
                System.out.print(tDArray[i][j]);
            }
            System.out.println();
        }
    }
}
