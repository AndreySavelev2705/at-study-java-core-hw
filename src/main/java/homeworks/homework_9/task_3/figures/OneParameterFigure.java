package homeworks.homework_9.task_3.figures;

import java.util.Random;

public abstract class OneParameterFigure extends Figure {

    public OneParameterFigure() {
        parameter1 = new Random().nextInt(10) + 1;
    }
}
