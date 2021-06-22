package homeworks.homework_6.task_4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();

        for (int i = 0; i < 500; i++) {
            persons.add(new Person().random());
        }

        for (IdentityDocumentType identityDocumentType : IdentityDocumentType.values()) {
            int countOFPersons = 0;
            for (Person person : persons) {
                if (identityDocumentType.getCode().equals(person.getIdentityDocumentType().getCode())) {
                    countOFPersons++;
                }
            }
            String nameOfDocument = identityDocumentType.getDescription();
            String codeOfDocument = identityDocumentType.getCode();
            System.out.printf("%s(%s):%d%n", nameOfDocument, codeOfDocument, countOFPersons);
        }


        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (!person.getIdentityDocumentType().getCode().equals("21")) {
                iterator.remove();
            }
        }
        System.out.printf("В множестве осталось %d человек(-а).%n", persons.size());
    }
}
