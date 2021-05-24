package homeworks.homework_1.task_5;

public class LogicalCalculation {

    boolean getTheInversionOfALogicalOr (boolean bArg1, boolean bArg2) {

        boolean result = bArg1 || bArg2;

        return !result;
    }

    boolean getLogicalAndWithInvertedParameters (boolean bArg1, boolean bArg2) {

        boolean result = !bArg1 && !bArg2;

        return result;
    }
}
