package homeworks.homework_2.task_4;

import java.util.Arrays;

public class ApplicationTwoStrings {
    public ApplicationTwoStrings() {
    }

    public static void main(String[] args) {
        String first = "post";
        String second = "get";
        char[] firstAsChars = first.toCharArray();
        Arrays.sort(firstAsChars);
        String result = "";
        char[] var5 = firstAsChars;
        int var6 = firstAsChars.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            char ch = var5[var7];
            String symbol = String.valueOf(ch);
            if (!result.contains(symbol) && second.contains(symbol)) {
                result = result + symbol;
            }
        }

        System.out.println(result);
    }
}
