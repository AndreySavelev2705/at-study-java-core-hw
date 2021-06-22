package homeworks.homework_5.task_4;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) throws AgeTooHighException {
        setName(name);
        try {
            setAge(age);
        } catch (AgeUnderZeroException auze) {
            System.out.println(auze.getStackTrace()[0]);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeTooHighException {
        if (age < 0) {
            throw new AgeUnderZeroException("Возраст не может быть отрицательным.");
        } else if (age > 20) {
            throw new AgeTooHighException("Возраст слишком большой для кота.");
        }
        this.age = age;
    }
}
