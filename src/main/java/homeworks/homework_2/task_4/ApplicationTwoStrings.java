package homeworks.homework_2.task_4;

import java.util.Arrays;

public class ApplicationTwoStrings {
    public static void main(String[] args) {
        String first = "post";
        String second = "get";

        char[] firstAsChars = first.toCharArray();
        Arrays.sort(firstAsChars); // Сортируем первую строку по алфавиту. Тогда в результирующей строке будет гарантированно все в алфавитном порядке.

        String result = "";
        for (char ch : firstAsChars) {
            String symbol = String.valueOf(ch); // Преобразование символа в строк
            if (result.contains(symbol)) continue;  // Переходим к следующему символу, игнорируя код ниже, если он(символ) уже есть в итоговой строке
            if (second.contains(symbol)) result += symbol; // Если символ есть во второй строке, и его нет в результирующей, то добавляем символ в результрующую строку.
        }
        System.out.println(result);
    }
}