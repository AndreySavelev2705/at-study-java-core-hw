package homeworks.homework_3.task_4;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class ApplicationHuman {
    public static void main(String[] args) {

        Human sergey = new Human("Сергей");
        Human valeriy = new Human("Валерий");
        Human stanislav = new Human("Станислав");
        Human mixail = new Human("Михаил");
        Human egor = new Human("Егор");
        Human alexandr = new Human("Александр");
        Human grigoriy = new Human("Григорий");

        sergey.addToFriends(valeriy);
        sergey.addToFriends(grigoriy);

        valeriy.addToFriends(sergey);
        valeriy.addToFriends(stanislav);

        stanislav.addToFriends(valeriy);
        stanislav.addToFriends(mixail);

        mixail.addToFriends(stanislav);
        mixail.addToFriends(alexandr);

        egor.addToFriends(alexandr);
        egor.addToFriends(grigoriy);

        alexandr.addToFriends(mixail);
        alexandr.addToFriends(egor);
        alexandr.addToFriends(grigoriy);

        grigoriy.addToFriends(alexandr);
        grigoriy.addToFriends(sergey);
        grigoriy.addToFriends(egor);

        System.out.println(isFriends(sergey, grigoriy));
        System.out.println(isFriends(sergey, alexandr));
        System.out.println(isFriends(stanislav, mixail));
        System.out.println(isFriends(mixail, valeriy));
    }

    public static boolean isFriends(Human human1, Human human2) {

        boolean result = false;

        String firstName = human1.name;

        for (int i = 0; i < human2.friends.length; i++) {
            // Присваивание имени очередного друга
            String secondName = human2.friends[i].name;

            // сравнение имени очередного друга с именем первого друга
            if (secondName.equals(firstName)) {
                return !result;
            }
        }
        return result;
    }
}
