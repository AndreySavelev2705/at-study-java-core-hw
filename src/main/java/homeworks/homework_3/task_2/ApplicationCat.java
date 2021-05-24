package homeworks.homework_3.task_2;

import javafx.concurrent.Worker;

import java.util.Arrays;
import java.util.Comparator;

public class ApplicationCat {
    public static void main(String[] args) {
        Cat[] arrayCats = { new Cat(2, 5, "Барсик"),
                            new Cat(3, 11, "Мурзик"),
                            new Cat(7, 2, "Матильда"),
                            new Cat(1, 3,"Леопольд"),
                            new Cat(11, 4, "Базилио")};

        String[] namesOfCats = new String[arrayCats.length];

        for (int i = 0; i < arrayCats.length; i++) {
            namesOfCats[i] = arrayCats[i].name;
        }

        Arrays.sort(namesOfCats);

        for (int i = 0; i < namesOfCats.length; i++) { // Цикл по ходящий именам из массива namesOfCats
            for (int j = 0; j < arrayCats.length; j++) { // Цикл, сравнивающий текущие имя под индексом i с имекнами всех котов в массиве arrayCats
                if (arrayCats[j].name.equals(namesOfCats[i])) {
                    System.out.printf("Имя: %s, Возраст: %d. Вес: %d%n",
                            arrayCats[j].name,
                            arrayCats[j].age,
                            arrayCats[j].weight);
                }
            }
        }
    }
}
