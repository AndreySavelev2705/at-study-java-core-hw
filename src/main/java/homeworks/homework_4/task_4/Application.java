package homeworks.homework_4.task_4;

public class Application {
    public static void main(String[] args) {
        Passport passport = new Passport()
                .setSeries("1234")
                .setNumber("567890");

        Passport passport1 = new Passport()
                .setSeries("1234")
                .setNumber("567890");

        Passport passport3 = new Passport()
                .setSeries("1234")
                .setNumber("567890");

        Passport passport4 = new Passport()
                .setSeries("1234")
                .setNumber("567891");

        Passport passport5 = new Passport()
                .setSeries("1235")
                .setNumber("567890");
    }
}
