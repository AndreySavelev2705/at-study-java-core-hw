package homeworks.homework_4.task_1;

public class ApplicationHuman {
    public static void main(String[] args) {
        Human human = new Human();

        human.setFirstName("Андрей");
        human.setSecondName("Савельев");
        human.setBirthDay("27.05.1995");

        System.out.println(human.getFirstName());
        System.out.println(human.getSecondName());
        System.out.println(human.getBirthDay());
    }
}
