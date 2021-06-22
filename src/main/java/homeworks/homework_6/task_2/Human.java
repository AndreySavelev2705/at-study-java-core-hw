package homeworks.homework_6.task_2;

import homeworks.homework_6.task_2.generators.AgeGenerator;
import homeworks.homework_6.task_2.generators.NameGenerator;
import homeworks.homework_6.task_2.generators.PhoneGenerator;

import java.util.HashMap;
import java.util.Map;

public class Human {
    private String firstName;
    private String secondName;
    private int age;
    private Map<PhoneType, String> phones = new HashMap<>();

    public Human() {
        firstName = NameGenerator.generate();
        secondName = NameGenerator.generate();
        age = AgeGenerator.generate();
    }

    public String getFirstName() {
        return firstName;
    }

    public Human setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSecondName() {
        return secondName;
    }

    public Human setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Human setAge(int age) {
        this.age = age;
        return this;
    }

    public Map<PhoneType, String> getPhones() {
        return phones;
    }

    public Human setPhones(PhoneType phoneType, boolean chance) {
        if (chance) {
            String phoneNumber = PhoneGenerator.generate();
            phones.put(phoneType, phoneNumber);
        }
        return this;
    }
}
