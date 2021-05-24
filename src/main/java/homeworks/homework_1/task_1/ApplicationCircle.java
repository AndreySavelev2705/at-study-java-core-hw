package homeworks.homework_1.task_1;

public class ApplicationCircle {

    public static void main(String[] args) {

        Circle circle = new Circle();

        System.out.println("Входные данные: 0; Площадь окружности равна: " + circle.getAreaOfACircle(0));
        System.out.println("Входные данные: 2; Площадь окружности равна: " + circle.getAreaOfACircle(2));
        System.out.println("Входные данные: 100; Площадь окружности равна: " + circle.getAreaOfACircle(100));
    }
}
