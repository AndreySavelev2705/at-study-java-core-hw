package homeworks.homework_10.task_4.model;

import homeworks.homework_10.task_4.helpers.Property;
import homeworks.homework_10.task_4.helpers.StringGenerator;

public class Passport implements Generatable{

    private String series;
    private String number;


    @Override
    public Object generate() {
        String pattern = "0123456789";
        series = StringGenerator.generate(Property.PASSPORT_SERIES_DIGITS, pattern);
        number = StringGenerator.generate(Property.PASSPORT_NUMBER_DIGITS, pattern);

        return this;
    }

    @Override
    public String toString() {
        return String.format("%s %s", series, number);
    }
}
