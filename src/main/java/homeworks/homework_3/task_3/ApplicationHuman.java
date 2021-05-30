package homeworks.homework_3.task_3;

public class ApplicationHuman {
    public static void main(String[] args) {
        // Родители мужа
        Human paternalGrandfather = new Human("Валерий", 73, null, null);
        Human paternalGrandmother = new Human("Александра", 68, null, null);

        // Родители жены
        Human maternalGrandfather = new Human("Иван", 75, null, null);

        // Муж и жена
        Human father = new Human("Сергей", 30, paternalGrandfather, paternalGrandmother);
        Human mother = new Human("Марина", 28, maternalGrandfather, null);

        // Сын и дочь
        Human son = new Human("Виталий", 4, father, mother);
        Human daughter = new Human("Елена", 6, father, mother);

        Human[] grandsParents = new Human[4];
        int index = 0;

        for (int i = 0; i < daughter.parents.length; i++) {
            Human[] daughtersParents = daughter.parents[i].parents;

            for (int j = 0; j < daughtersParents.length; j++) {
                if (daughtersParents[j] != null) {
                    grandsParents[index] = daughtersParents[j];
                }
                index++;
            }
        }

        for (int i = 0; i < grandsParents.length; i++) {
            if (grandsParents[i] != null)
                System.out.printf("Имя: %s, Возраст: %d%n", grandsParents[i].name, grandsParents[i].age);
        }
    }
}
