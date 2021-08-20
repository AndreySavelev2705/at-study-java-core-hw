package homeworks.homework_9.task_3.figures.implementations;

import homeworks.homework_9.task_3.figures.OneParameterFigure;

public class EquilateralTriangle extends OneParameterFigure {

    @Override
    public double getArea() {
        return Math.sqrt(3) * parameter1 * parameter1 / 4;
    }

    @Override
    public double getLength() {
        return 3 * parameter1;
    }
}
