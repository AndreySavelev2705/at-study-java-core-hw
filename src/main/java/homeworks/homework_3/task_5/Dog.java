package homeworks.homework_3.task_5;

import java.util.Random;

public class Dog {
    int age;
    String name;

    public Dog() {
        age = new Random().nextInt(10) + 1;
        name = Names.getNamesOfDogs();
    }
}