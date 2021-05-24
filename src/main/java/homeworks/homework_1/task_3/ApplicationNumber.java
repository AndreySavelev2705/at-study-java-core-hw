package homeworks.homework_1.task_3;

public class ApplicationNumber {

    public static void main(String[] args) {

        Number number = new Number();

        System.out.println("Входные данные: 14; Число четное так как возвращается: " + number.isTheNumberOddOrEven(14));
        System.out.println("Входные данные: 19; Число нечетное так как возвращается: "
                + number.isTheNumberOddOrEven(19));
    }
}
