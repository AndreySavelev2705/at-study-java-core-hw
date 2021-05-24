package homeworks.homework_3.task_4;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Random;

public class Human {
    String name;
    Human[] friends = new Human[0];

    public Human(String name) {
        this.name = name;
    }

    public void addToFriends(Human friend) {
        // Временный массив, в который копируется содержимое массива объекта,
        // который уже может содержать друзей
        Human[] arrayFriends = Arrays.copyOf(friends, friends.length+1);

        // Если элемент временного массива с индексом равным
        // длине массива текущего объекта пуст,то добавить в него друга
        // и записать новый массив в массив текущего объекта
        if (arrayFriends[friends.length] == null) {
            arrayFriends[friends.length] = friend;
            friends = Arrays.copyOf(arrayFriends, arrayFriends.length);
        }
    }
}
