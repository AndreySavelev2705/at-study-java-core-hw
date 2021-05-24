package homeworks.homework_1.task_2;

public class Rectangle {

    int width;
    int height;

    boolean isAreaBiggerThenPerimeter(int width, int height) {

        int area = width * height;
        int perimeter = (width * 2) + (height * 2);

        boolean result = area > perimeter ? true : false;

        return result;
    }

}
