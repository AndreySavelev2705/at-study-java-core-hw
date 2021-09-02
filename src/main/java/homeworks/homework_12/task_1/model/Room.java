package homeworks.homework_12.task_1.model;

import org.apache.poi.ss.formula.functions.T;

public class Room implements Generatable{

    private int width;
    private int height;

    public Room() {
        width = 5;
        height = 3;
    }

    public Room(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public T generate() {
//        width = 5;
//        height = 3;
//
        return null;
    }
}
