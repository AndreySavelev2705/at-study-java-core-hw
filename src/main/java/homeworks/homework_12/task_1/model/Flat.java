package homeworks.homework_12.task_1.model;

import java.util.ArrayList;
import java.util.List;

public class Flat implements Generatable{

    List<Room> rooms = new ArrayList<>();

    public Flat() {
    }

    public Flat(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public Flat generate() {
        for (int i = 0; i < 2; i++) {
            rooms.add(new Room().generate());
        }

        return this;
    }
}
