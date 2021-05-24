package homeworks.homework_3.task_3;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Random;

public class Human {
    String name;
    int age;
    Human[] parents = new Human[2];

    public Human(String name) {
        this.name = name;

    }

    public Human(String name, int age, Human father, Human mother) {
        this.name = name;
        this.age = age;
        this.parents[0] = father;
        this.parents[1] = mother;
    }
}
