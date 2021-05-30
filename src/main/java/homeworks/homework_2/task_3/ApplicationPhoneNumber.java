package homeworks.homework_2.task_3;

public class ApplicationPhoneNumber {
    public ApplicationPhoneNumber() {
    }

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        System.out.println(phoneNumber.isEqualsRegex("+7(910)423-73-12"));
        System.out.println(phoneNumber.isEqualsRegex("7(910)423-73-12"));
        System.out.println(phoneNumber.isEqualsRegex("89215310934"));
        System.out.println(phoneNumber.isEqualsRegex("+5(911)310-12-74"));
        System.out.println(phoneNumber.isEqualsRegex("+7(9fg)125-42-99"));
        System.out.println(phoneNumber.isEqualsRegex("+7(122)2342343"));
        System.out.println();
        System.out.println(phoneNumber.isEquals("+7(910)423-73-12"));
        System.out.println(phoneNumber.isEquals("7(910)423-73-12"));
        System.out.println(phoneNumber.isEquals("89215310934"));
        System.out.println(phoneNumber.isEquals("+5(911)310-12-74"));
        System.out.println(phoneNumber.isEquals("+7(9fg)125-42-99"));
        System.out.println(phoneNumber.isEquals("+7(122)2342343"));
    }
}
