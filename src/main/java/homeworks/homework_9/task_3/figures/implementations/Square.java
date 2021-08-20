package homeworks.homework_9.task_3.figures.implementations;

import homeworks.homework_9.task_3.figures.OneParameterFigure;

public class Square extends OneParameterFigure {

    @Override
    public double getArea() {
        return parameter1 * parameter1;
    }

    @Override
    public double getLength() {
        return 4 * parameter1;
    }
}