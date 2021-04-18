package homeworks.homework_1;

public class LogicalCalculation {

    // Задача 5
    boolean getTheInversionOfALogicalOr (boolean bArg1, boolean bArg2) {

        boolean result = bArg1 || bArg2;

        return !result;
    }

    boolean getLogicalAndWithInvertedParameters (boolean bArg1, boolean bArg2) {

        boolean result = !bArg1 && !bArg2;

        return result;
    }

    // Задача 6
    boolean schematicDiagram (boolean bArg1, boolean bArg2, boolean bArg3, boolean bArg4) {

        boolean theFirstLogicalAnd = bArg1 && bArg2;

        boolean theFirstLogicalOrNo = !bArg3 || !bArg4;

        boolean result = theFirstLogicalAnd && theFirstLogicalOrNo;

        return result;
    }
}
