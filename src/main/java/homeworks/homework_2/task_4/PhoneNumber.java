package homeworks.homework_2.task_3;

public class PhoneNumber {
    public PhoneNumber() {
    }

    boolean isEqualsRegex(String phoneNumber) {
        return phoneNumber.matches("^\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$");
    }

    Boolean isEquals(String phoneNumber) {
        if (phoneNumber != null && phoneNumber.length() == 16) {
            int[] numericIndexes = new int[]{3, 4, 5, 7, 8, 9, 11, 12, 14, 15};
            String numbers = "0123456789";
            if (!phoneNumber.startsWith("+7(")) {
                return false;
            } else if (phoneNumber.charAt(6) != ')') {
                return false;
            } else if (phoneNumber.charAt(10) == '-' && phoneNumber.charAt(13) == '-') {
                int[] var4 = numericIndexes;
                int var5 = numericIndexes.length;

                for(int var6 = 0; var6 < var5; ++var6) {
                    int index = var4[var6];
                    String symbol = String.valueOf(phoneNumber.charAt(index));
                    if (!numbers.contains(symbol)) {
                        return false;
                    }
                }

                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
