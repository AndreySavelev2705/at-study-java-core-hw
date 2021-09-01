package homeworks.homework_11.task_2;

public class Human {
    private String firstname;
    private int age;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        if (!firstname.matches("^[А-ЯЁ]?[а-яё]{2,11}$")) {
            throw new IllegalArgumentException("Некорректное имя: " + firstname);
        }
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Некорректный возраст: " + age);
        }
        this.age = age;
    }
}
