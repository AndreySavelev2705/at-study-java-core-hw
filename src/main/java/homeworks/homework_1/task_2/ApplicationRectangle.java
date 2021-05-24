package homeworks.homework_1.task_2;

public class ApplicationRectangle {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        System.out.println("Входные данные: 2 и 7; Площадь прямоугольника меньше его периметра так как возвращается: "
                + rectangle.isAreaBiggerThenPerimeter(2,7));

        System.out.println("Входные данные: 2 и 7; Площадь прямоугольника больше его периметра так как возвращается: "
                + rectangle.isAreaBiggerThenPerimeter(6,5));

        System.out.println("Входные данные: 6 и 3; Площадь прямоугольника меньше его периметра так как возвращается: "
                + rectangle.isAreaBiggerThenPerimeter(6,3));
    }
}
