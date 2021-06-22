package homeworks.homework_6.task_4;

import java.util.Random;

public class IdentityDocument {
    private static IdentityDocumentType identityDocumentType;
        private static String seriesAndNumber;

    public static IdentityDocumentType random() {
        IdentityDocumentType[] documentTypes = IdentityDocumentType.values();
        int index = new Random().nextInt(documentTypes.length);
        identityDocumentType = documentTypes[index];
        seriesAndNumber = StringGenerator.getTypeOfDocument(identityDocumentType);
        return identityDocumentType;
    }

    public static String getSeriesAndNumber() {
        return seriesAndNumber;
    }
}
