package homeworks.homework_11.task_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NameTest {

    @Test
    @DisplayName("Проверка формата имени")
    public void checkNameTest() {
        Human human = new Human();
        human.setFirstname("Иван5аа");
        Assertions.assertEquals(human.getFirstname(), "Иван");
//        Assertions.assertEquals(human.getFirstname(), "Ив");
//        Assertions.assertEquals(human.getFirstname(), "Ивансдлиннымименем");
//        Assertions.assertEquals(human.getFirstname(), "Иван5аа");
    }
}
