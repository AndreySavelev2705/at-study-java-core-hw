package homeworks.homework_6.task_1;

public class Human {
    private String firstName;
    private String secondName;
    private String phoneNumber;
    private int age;

    Human() {
        firstName = NameGenerator.generate();
        secondName = NameGenerator.generate();
        phoneNumber = PhoneGenerator.generate();
        age = AgeGenerator.generate();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }
}
