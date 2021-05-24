package homeworks.homework_3.task_5;
import java.util.Random;

public class Names {
    public static String[] namesOfPeople = {"Андрей", "Владимир", "Ксения", "Надежда", "Александр", "Екатирина", "Иван", "Мария", "Наталья", "Анастасия"};
    public static String[] namesOfDogs = {"Бобик", "Жучка", "Белка", "Стрелка", "Барбос", "Рекс", "Жулька", "Кагтанка", "Герда", "Лана"};
    public static String[] namesOfCats = {"Мурка", "Дымка", "Маруся", "Сема", "Барсик", "Фенька", "Мурзик", "Том", "Снежок", "Васька"};

    public static String getNamesOfPeople() {
        return namesOfPeople[new Random().nextInt(10)];
    }

    public static String getNamesOfDogs() {
        return namesOfDogs[new Random().nextInt(10)];
    }

    public static String getNamesOfCats() {
        return namesOfCats[new Random().nextInt(10)];
    }
}
