package homeworks.homework_6.task_4;

public enum IdentityDocumentType {
    MILITARY_ID("07","Военный билет"),
    DIPLOMATIC_PASSPORT("09","Дипломатический паспорт"),
    FOREIGN_CITIZEN_PASSPORT("10","Паспорт иностранного гражданина"),
    PASSPORT_OF_A_CITIZEN_OF_THE_RUSSIAN_FEDERATION("21","Паспорт гражданина Российской Федерации"),
    INTERNATIONAL_PASSPORT_OF_A_CITIZEN_OF_THE_RUSSIAN_FEDERATION("22","Загранпаспорт гражданина Российской Федерации");

    private String code;
    private String description;

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    IdentityDocumentType(String code, String description) {
        this.code = code;
        this.description = description;
    }
}
