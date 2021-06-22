package homeworks.homework_6.task_4;

import java.util.Random;

public class StringGenerator {
    private static String engSmallAndBig = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String rusBig = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static String numbers = "0123456789";

    public static String getTypeOfDocument(IdentityDocumentType identityDocumentType) {
        String code = identityDocumentType.getCode();
        switch (code) {
            case "07":
                return generateMilitaryID();
            case "09":
                return generateDiplomaticPassport();
            case "10":
                return generatePassportOfForeignCitizen();
            case "21":
                return generatePassportOfCitizenOfTheRussianFederation();
            case "22":
                return generateInternationalPassportOfCitizenOfTheRussianFederation();
        }
        return "Что-то пошло не так";
    }

    private static String generateMilitaryID() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            int indexForAlphabet = new Random().nextInt(33);
            int indexForNumbers = new Random().nextInt(10);
            switch (i) {
                case 0:
                case 1:
                    result += rusBig.charAt(indexForAlphabet);
                    break;
                case 2:
                    result += " ";
                    break;
                case 3:
                    boolean yesOrNO = new Random().nextBoolean();
                    if (yesOrNO) {
                        result += numbers.charAt(indexForNumbers);
                        break;
                    }
                    break;
                default:
                    result += numbers.charAt(indexForNumbers);
                    break;
            }
        }
        return result;
    }

    private static String generateDiplomaticPassport() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            int indexForNumbers = new Random().nextInt(10);
            if (i == 2) {
                result += " ";
                continue;
            }
            result += numbers.charAt(indexForNumbers);
        }
        return result;
    }

    private static String generatePassportOfForeignCitizen() {
        String result = "";
        int length = new Random().nextInt(26) + 1;
        for (int i = 0; i < length; i++) {
            int indexForAlphabet = new Random().nextInt(33);
            result += engSmallAndBig.charAt(indexForAlphabet);
        }
        return result;
    }

    private static String generatePassportOfCitizenOfTheRussianFederation() {
        String result = "";
        for (int i = 0; i < 12; i++) {
            int indexForNumbers = new Random().nextInt(10);
            switch (i) {
                case 2:
                case 5:
                    result += " ";
                    break;
                default:
                    result += numbers.charAt(indexForNumbers);
                    break;
            }
        }
        return result;
    }

    private static String generateInternationalPassportOfCitizenOfTheRussianFederation() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            int indexForNumbers = new Random().nextInt(10);
            if (i == 2) {
                result += " ";
                continue;
            }
            result += numbers.charAt(indexForNumbers);
        }
        return result;
    }
}
