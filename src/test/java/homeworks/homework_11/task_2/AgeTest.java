package homeworks.homework_11.task_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AgeTest {

    @Test
    @DisplayName("Проверка возраста")
    public void checkAgeTest() {
        Human human = new Human();
        human.setAge(0);
        Assertions.assertEquals(human.getAge(), 0);
//        Assertions.assertEquals(human.getAge(), 60);
//        Assertions.assertEquals(human.getAge(), 120);
//        Assertions.assertEquals(human.getAge(), -1);
//        Assertions.assertEquals(human.getAge(), 121);
    }
}
