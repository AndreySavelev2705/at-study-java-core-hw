package homeworks.homework_9.task_3.figures.implementations;

import homeworks.homework_9.task_3.figures.TwoParameterFigure;

public class Rectangle extends TwoParameterFigure {

    @Override
    public double getArea() {
        return parameter1 * parameter2;
    }

    @Override
    public double getLength() {
        return 2 * (parameter1 + parameter2);
    }
}
