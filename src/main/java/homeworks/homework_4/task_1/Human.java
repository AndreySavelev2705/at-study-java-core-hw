package homeworks.homework_4.task_1;

import java.util.Date;
import java.util.regex.Pattern;

public class Human {

    private String firstName;
    private String lastName;

    private Date birthDay = new Date();

    public Human() {

    }

    public void setFirstName(String firstName) {
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]");

        /*
            Проверка, что слово на кириллице.
            [а-яА-ЯёЁ] - в диапозоне всех букв на кириллице.
            {1,} от 1 до бесконечности раз(так же можно использовать просто символ +)
        */
        if (firstName.matches("[а-яА-ЯёЁ]+")) {

            /*
                Проверка, что введенное слово начинается с большой буквы и что после нее только строчные.
                \b -это граница слова. Он соответствует началу и окончанию слова
                . соответствует любому символу,
                * соответствует предыдущему символу 0 или более раз,
                ? делает предыдущий * не жадным, поэтому он соответствует как можно меньшему количеству символов вместо всей строки
             */
            if (firstName.matches("\\b[А-ЯЁ]?[а-яё]*\\b"))
                System.out.println("Слово с большой буквы и на кирилицце");
            else
                System.out.println("Слово с маленькой буквы");
        }

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public String getPrint() {
        return "";
    }

    public String setCorrectPrint() {
        return "";
    }

    public String setIncorrectPrint() {
        return "";
    }
}
