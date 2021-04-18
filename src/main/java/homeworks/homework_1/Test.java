package homeworks.homework_1;

public class Test {

    public static void main(String[] args) {
        System.out.println("Задача № 1");

        Circle circle = new Circle();

        System.out.println("Входные данные: 0; Площадь окружности равна: " + circle.getAreaOfACircle(0));
        System.out.println("Входные данные: 2; Площадь окружности равна: " + circle.getAreaOfACircle(2));
        System.out.println("Входные данные: 100; Площадь окружности равна: " + circle.getAreaOfACircle(100));

        System.out.println();

        System.out.println("Задача № 2");

        Rectangle rectangle = new Rectangle();

        System.out.println("Входные данные: 2 и 7; Площадь прямоугольника меньше его периметра так как возвращается: "
                + rectangle.isAreaBiggerThenPerimeter(2,7));

        System.out.println("Входные данные: 2 и 7; Площадь прямоугольника больше его периметра так как возвращается: "
                + rectangle.isAreaBiggerThenPerimeter(6,5));

        System.out.println("Входные данные: 6 и 3; Площадь прямоугольника меньше его периметра так как возвращается: "
                + rectangle.isAreaBiggerThenPerimeter(6,3));

        System.out.println();

        System.out.println("Задача № 3");

        Number number = new Number();

        System.out.println("Входные данные: 14; Число четное так как возвращается: " + number.isTheNumberOddOrEven(14));
        System.out.println("Входные данные: 19; Число нечетное так как возвращается: "
                + number.isTheNumberOddOrEven(19));

        System.out.println();

        System.out.println("Задача № 4");

        Number number1 = new Number();

        System.out.println("Входные данные: 115см; В целых метрах это: " + number1.lengthInMeters(115));
        System.out.println("Входные данные: 800см; В целых метрах это: " + number1.lengthInMeters(800));
        System.out.println("Входные данные: 278см; В целых метрах это: " + number1.lengthInMeters(278));

        System.out.println();

        System.out.println("Задача № 5");

        System.out.println();

        System.out.println("Первый метод");

        LogicalCalculation logicalCalculation = new LogicalCalculation();

        System.out.println("Входные данные: false, false; результат логического ИЛИ: "
                + logicalCalculation.getTheInversionOfALogicalOr(false, false));

        System.out.println("Входные данные: false, true; результат логического ИЛИ: "
                + logicalCalculation.getTheInversionOfALogicalOr(false, true));

        System.out.println("Входные данные: true, false; результат логического ИЛИ: "
                + logicalCalculation.getTheInversionOfALogicalOr(true, false));

        System.out.println("Входные данные: true, true; результат логического ИЛИ: "
                + logicalCalculation.getTheInversionOfALogicalOr(true, true));

        System.out.println();
        System.out.println("Второй метод");

        LogicalCalculation logicalCalculation1 = new LogicalCalculation();

        System.out.println("Входные данные: false, false; результат логического И между инвертированными элементами: "
                + logicalCalculation1.getLogicalAndWithInvertedParameters(false, false));

        System.out.println("Входные данные: false, true; результат логического И между инвертированными элементами: "
                + logicalCalculation1.getLogicalAndWithInvertedParameters(false, true));

        System.out.println("Входные данные: true, false; результат логического И между инвертированными элементами: "
                + logicalCalculation1.getLogicalAndWithInvertedParameters(true, false));

        System.out.println("Входные данные: true, true; результат логического И между инвертированными элементами: "
                + logicalCalculation1.getLogicalAndWithInvertedParameters(true, true));

        System.out.println();

        System.out.println("Задача № 5");

        System.out.println();

        LogicalCalculation logicalCalculation2 = new LogicalCalculation();

        System.out.println("Входные данные на принципиальную схему: false, false, false, false; Результат: "
                + logicalCalculation2.schematicDiagram(false, false, false, false));

        System.out.println("Входные данные на принципиальную схему: true, true, true, true; Результат: "
                + logicalCalculation2.schematicDiagram(true, true, true, true));

        System.out.println("Входные данные на принципиальную схему: false, true, false, true; Результат: "
                +logicalCalculation2.schematicDiagram(false, true, false, true));

        System.out.println("Входные данные на принципиальную схему: true, false, true, false; Результат: "
                +logicalCalculation2.schematicDiagram(true, false, true, false));

        System.out.println("Входные данные на принципиальную схему: true, true, false, false; Результат: "
                +logicalCalculation2.schematicDiagram(true, true, false, false));
    }
}
