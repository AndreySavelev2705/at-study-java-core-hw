package homeworks.homework_1.task_6;

public class LogicalCalculation {

    boolean schematicDiagram (boolean bArg1, boolean bArg2, boolean bArg3, boolean bArg4) {

        boolean theFirstLogicalAnd = bArg1 && bArg2;

        boolean theFirstLogicalOrNo = !bArg3 || !bArg4;

        boolean result = theFirstLogicalAnd && theFirstLogicalOrNo;

        return result;
    }
}
