package homeworks.homework_1.task_4;

public class ApplicationNumber {

    public static void main(String[] args) {

        Number number = new Number();

        System.out.println("Входные данные: 115см; В целых метрах это: " + number.lengthInMeters(115));
        System.out.println("Входные данные: 800см; В целых метрах это: " + number.lengthInMeters(800));
        System.out.println("Входные данные: 278см; В целых метрах это: " + number.lengthInMeters(278));
    }
}
