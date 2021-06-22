package homeworks.homework_5.task_2;

public class ApplcationCat {
    public static void main(String[] args) {
        Cat cat0 = new Cat(null, 0);
        Cat cat1 = new Cat("Мурзик", 5);
        Cat cat2 = new Cat("Дымка", 3);
        Cat cat3 = new Cat("Маша", 18);
        Cat cat4 = new Cat("Васька", 4);

        Cat[] cats = {cat0, cat1, cat2, cat3, cat4};

        for (Cat cat : cats) {
            try {
                System.out.printf("Имя: %s, возраст:%d%n", cat.name, cat.age);
                System.out.println(cat.name.length());
            } catch (NullPointerException npe) {
                System.out.println("Имя пустое");
                break;
            }

        }
    }
}
