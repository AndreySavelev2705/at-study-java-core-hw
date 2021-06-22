package homeworks.homework_5.task_5;

public class ApplicationPassport {
    public static void main(String[] args) {
        try {
            Passport passport = createPassport("11 11", "111111");
//            Passport passport2 = createPassport("11 12", "111112");
//            Passport passport9 = createPassport("11 12", "111112");

        } catch (PassportSeriesArgumentException psae) {
            System.out.println("Введите верные значения серии и номера паспорта");
        } catch (PassportNumberArgumentException pnas) {
            System.out.println("Введите верные значения серии и номера паспорта");
        } catch (PassportSeriesNullPointerException psnpe) {
            System.out.println("Введите верные значения серии и номера паспорта");
        } catch (PassportNumberNullPointerException pnnpe) {
            System.out.println("Введите верные значения серии и номера паспорта");
        } catch (PassportAlreadyExistsException paee) {
            System.out.println("Данные серия и номер паспорта уже существуют");
        }
    }

    public static Passport createPassport(String series, String number) {
        Passport passport = new Passport(series, number);
        return passport;
    }
}