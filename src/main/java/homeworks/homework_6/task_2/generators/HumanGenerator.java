package homeworks.homework_6.task_2.generators;

import homeworks.homework_6.task_2.Chance;
import homeworks.homework_6.task_2.Human;
import homeworks.homework_6.task_2.PhoneType;

public class HumanGenerator {
    public static Human generate() {
        Human human = new Human();

        for (int i = 0; i < PhoneType.values().length; i++) {
            //int percent = new Random().nextInt(101);
            boolean chance = Chance.calculateChance(20);
            PhoneType phoneType = PhoneType.values()[i];
            human.setPhones(phoneType, chance);
        }
        return human;
    }
}
