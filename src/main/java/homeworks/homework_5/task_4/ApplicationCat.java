package homeworks.homework_5.task_4;

import java.util.Random;

public class ApplicationCat {
    public static void main(String[] args) {
        Cat[] cats = new Cat[10];
        int index = 0;

        try {
            for (int i = 0; i < cats.length; i++) {
                int age = new Random().nextInt(100) - 50;
                cats[i] = new Cat("Кот", age);
                index++;
            }
        } catch (AgeTooHighException athe) {
            cats[index] = null;
            System.out.println(athe.getMessage());
        }

        try {
            for (Cat cat : cats) {
                System.out.printf("Имя: %s, Возраст: %d%n", cat.getName(), cat.getAge());
            }
        } catch (NullPointerException npe) {
            System.out.println("Ошибка вывода данных");
        }
    }
}
