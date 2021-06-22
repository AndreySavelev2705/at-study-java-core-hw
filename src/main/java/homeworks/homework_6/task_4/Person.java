package homeworks.homework_6.task_4;

import java.util.Random;

public class Person {
    private String firstName;
    private String secondName;
    private IdentityDocumentType identityDocumentType;

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSecondName() {
        return secondName;
    }

    public Person setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public IdentityDocumentType getIdentityDocumentType() {
        return identityDocumentType;
    }

    public Person setIdentityDocumentType(IdentityDocumentType identityDocumentType) {
        this.identityDocumentType = identityDocumentType;
        return this;
    }

    public static Person random() {
        IdentityDocumentType[] documentTypes = IdentityDocumentType.values();
        int index = new Random().nextInt(documentTypes.length);
        Person person = new Person()
                .setFirstName("Валерий")
                .setSecondName("Жмышенко")
                .setIdentityDocumentType(documentTypes[index]);

        return person;
    }
}
