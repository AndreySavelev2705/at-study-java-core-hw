package homeworks.homework_8.task_3;

public enum Owner {
    QIWI("ООО \"Киви\""),
    ELEKSNET("ООО \"Элекснет\""),
    TINKOFF("АО \"Тинькофф\"");

    private String name;

    Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
