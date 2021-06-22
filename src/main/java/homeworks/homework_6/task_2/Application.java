package homeworks.homework_6.task_2;

import homeworks.homework_6.task_2.generators.HumanGenerator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Application {
    public static void main(String[] args) {
        Set<Human> humans = new HashSet<>();

        for (int i = 0; i < 2000; i++) {
            humans.add(HumanGenerator.generate());
        }

        System.out.println("Люди у которых есть все три номера телефона");

        for (Human human : humans) {
            if (human.getPhones().size() == 3) {
                System.out.printf("Имя: %s, Фамилия: %s, Возраст: %d%n", human.getFirstName(), human.getSecondName(), human.getAge());
            }
        }

        Iterator<Human> iterator = humans.iterator();
        while (iterator.hasNext()) {
            Human human = iterator.next();
            if (human.getPhones().size() == 1) {
                iterator.remove();
            }
        }

        System.out.println("\nТе кто остался после удаления людей с оодним номером телефона");
        System.out.println("Колличество людей после удаления: " + humans.size());
    }
}
