package homeworks.homework_1.task_5;

public class ApplicationLogicalCalculation {

    public static void main(String[] args) {

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
    }
}
