//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package homeworks.homework_2.task_2;

public class ApplicationTwoDimensionalArray {
    public ApplicationTwoDimensionalArray() {
    }

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
