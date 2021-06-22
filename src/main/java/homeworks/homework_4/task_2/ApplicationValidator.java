package homeworks.homework_4.task_2;

public class ApplicationValidator {
    public static void main(String[] args) {
        Validator.checkTheStringForTheNumberOfSpaces("qwe qwe qwe");
        Validator.checkTheStringForTheNumberOfSpaces("  ");

        String[] array = Validator.splitStringBySpaces("Привет, мой дорогой друг, как дела?");

        for (String str : array) {
            System.out.println(str);
        }

        Human human = new Human();

        human.setFirstName("Петя");
        human.setSecondName("Иванов");

        System.out.println(Validator.checkIfTheClassIsValid(human));

        Human[] humans = new Human[3];

        System.out.println(Validator.checkIfTheArrayIsValid(humans));

        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human();

            humans[i].setBirthDay("01.01.2000");
            humans[i].setFirstName("" + i);
            humans[i].setSecondName("" + i);
        }

        System.out.println(Validator.checkIfTheArrayIsValid(humans));
    }
}
