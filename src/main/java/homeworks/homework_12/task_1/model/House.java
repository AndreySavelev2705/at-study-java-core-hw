package homeworks.homework_12.task_1.model;

import java.util.ArrayList;
import java.util.List;

public class House implements Generatable {

    List<Flat> flats = new ArrayList<>();

    public House() {
    }

    public House(List<Flat> flats) {
        this.flats = flats;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    @Override
    public House generate() {
        for (int i = 0; i < 5; i++) {
            flats.add(new Flat().generate());
        }
        return this;
    }
}
