package homeworks.homework_9.task_3.figures;

import java.util.Random;

public abstract class TwoParameterFigure extends Figure {

    protected int parameter2;

    public TwoParameterFigure() {
        parameter1 = new Random().nextInt(10) + 1;
        parameter2 = new Random().nextInt(10) + 1;
    }

    public int getParameter2() {
        return parameter2;
    }
}
