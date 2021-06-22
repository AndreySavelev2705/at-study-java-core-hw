package homeworks.homework_4.task_4;

import java.util.Arrays;

public class PassportsStorage {

    private static Passport[] passports = new Passport[0];

    public static void addPassport(Passport passport) {

        if (passports.length == 0) {
            passports = Arrays.copyOf(passports, 1);
            passports[0] = passport;
            printPassportWasAdded();
            return;
        }

        passports = Arrays.copyOf(passports, passports.length + 1);
        passports[passports.length - 1] = passport;
        printPassportWasAdded();
    }

    public static boolean isPassportAllReadyExist(String series, String number) {

        for (Passport passport : passports) {
            String actualPassportSeries = passport.getSeries();
            String actualPassportNumber = passport.getNumber();

            if (actualPassportSeries == null || actualPassportNumber == null) continue;

            if (actualPassportSeries.equals(series) && actualPassportNumber.equals(number)) {
                printPassportWasNotAdded();
                return true;
            }
        }
        return false;
    }

    private static void printPassportWasAdded() {
        System.out.println("Пасспорт был успешно добавлен.");
    }

    private static void printPassportWasNotAdded() {
        System.out.println("Ошибка. Паспорт с такой серией или номером уже существуют.");
    }
}
