package homeworks.homework_3.task_5;

import java.util.Random;

public class Cat {
    int age;
    String name;

    public Cat() {
        age = new Random().nextInt(10) + 1;
        name = Names.getNamesOfCats();
    }
}
