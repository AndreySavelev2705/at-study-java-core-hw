package homeworks.homework_1.task_6;

public class ApplicationLogicalCalculation {

    public static void main(String[] args) {

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
