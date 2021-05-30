package homeworks.homework_2.task_3;

public class PhoneNumber {

    boolean isEqualsRegex(String phoneNumber) {

        return phoneNumber.matches("^\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$");
    }

    Boolean isEquals(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length() != 16)
            return false;

        int[] numericIndexes = {3, 4, 5, 7, 8, 9, 11, 12, 14, 15}; // Индексы в строке, которые принимают любые цифровые значения
        String numbers = "0123456789";

        // Проверка на +7 и открывающую и закрывающую скобки, а также дефис между номерами
        if (!phoneNumber.startsWith("+7("))
            return false;
        if (phoneNumber.charAt(6) != ')')
            return false;
        if (phoneNumber.charAt(10) != '-' || phoneNumber.charAt(13) != '-')
            return false;

        // Проверка, что элементы в строке phoneNumber под индексами {3, 4, 5, 7, 8, 9, 11, 12, 14, 15} - это числа
        for (int index : numericIndexes) { // получаем индекс символа в строке phoneNumber
            String symbol = String.valueOf(phoneNumber.charAt(index)); // Преобразование символа из строки phoneNumber в отдельную строку строку

            if (!numbers.contains(symbol)) { // Если символа нет в строке numbers, значит оно не число, и ввод был невалиден.
                return false;
            }
        }
        // Если все проверки пройдены успешно, возвращаем true
        return true;
    }
}
