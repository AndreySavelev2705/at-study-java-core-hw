package homeworks.homework_3.task_5;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Random;

public class Human {

    String name;

    Cat[] cats; // Добавлять как друзей
    Dog[] dogs; // Добавлять как друзей

    public Human() {

        name = Names.getNamesOfPeople();

        cats = new Cat[new Random().nextInt(4)];
        dogs = new Dog[new Random().nextInt(4)];

        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
        }

        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog();
        }
    }
}
