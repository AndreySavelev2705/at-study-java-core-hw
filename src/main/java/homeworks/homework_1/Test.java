package homeworks.homework_1;

public class Test {

    public static void main(String[] args) {
        System.out.println("Задача № 1");

        Circle circle = new Circle();

        System.out.println(circle.getAreaOfACircle(0));
        System.out.println(circle.getAreaOfACircle(2));
        System.out.println(circle.getAreaOfACircle(100));

        System.out.println();

        System.out.println("Задача № 2");

        Rectangle rectangle = new Rectangle();

        System.out.println(rectangle.isAreaBiggerThenPerimeter(2,7));
        System.out.println(rectangle.isAreaBiggerThenPerimeter(6,5));
        System.out.println(rectangle.isAreaBiggerThenPerimeter(6,3));

        System.out.println();

        System.out.println("Задача № 3");

        Number number = new Number();

        System.out.println(number.isTheNumberOddOrEven(14));
        System.out.println(number.isTheNumberOddOrEven(19));

        System.out.println();

        System.out.println("Задача № 4");

        Number number1 = new Number();

        System.out.println(number1.lengthInMeters(115));
        System.out.println(number1.lengthInMeters(800));
        System.out.println(number1.lengthInMeters(278));

        System.out.println();

        System.out.println("Задача № 5");

        System.out.println();

        System.out.println("Первый метод");

        LogicalCalculation logicalCalculation = new LogicalCalculation();

        System.out.println(logicalCalculation.getTheInversionOfALogicalOr(false, false));
        System.out.println(logicalCalculation.getTheInversionOfALogicalOr(false, true));
        System.out.println(logicalCalculation.getTheInversionOfALogicalOr(true, false));
        System.out.println(logicalCalculation.getTheInversionOfALogicalOr(true, true));

        System.out.println();
        System.out.println("Второй метод");

        LogicalCalculation logicalCalculation1 = new LogicalCalculation();

        System.out.println(logicalCalculation1.getLogicalAndWithInvertedParameters(false, false));
        System.out.println(logicalCalculation1.getLogicalAndWithInvertedParameters(false, true));
        System.out.println(logicalCalculation1.getLogicalAndWithInvertedParameters(true, false));
        System.out.println(logicalCalculation1.getLogicalAndWithInvertedParameters(true, true));

        System.out.println();

        System.out.println("Задача № 5");

        System.out.println();

        LogicalCalculation logicalCalculation2 = new LogicalCalculation();

        System.out.println(logicalCalculation2.schematicDiagram(false, false, false, false));
        System.out.println(logicalCalculation2.schematicDiagram(true, true, true, true));
        System.out.println(logicalCalculation2.schematicDiagram(false, true, false, true));
        System.out.println(logicalCalculation2.schematicDiagram(true, false, true, false));
        System.out.println(logicalCalculation2.schematicDiagram(true, true, false, false));
    }
}
