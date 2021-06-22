package homeworks.homework_6.task_1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            humans.add(new Human());
        }

        for (Human human : humans) {
            if (human.getAge() == 35) {
                System.out.printf("%s %s, возрвст %d, тел.%s%n", human.getSecondName(), human.getFirstName(), human.getAge(), human.getPhoneNumber());
            }
        }
    }
}
