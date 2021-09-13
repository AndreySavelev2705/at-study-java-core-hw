package homeworks.homework_12.task_1.house_tests;

import homeworks.homework_12.task_1.helpers.JsonHelper;
import homeworks.homework_12.task_1.model.House;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HouseJsonDeserializationTest {

    @Test
    @DisplayName("Дисериализация дома из Json файла")
    public void deserializationFromJsonHouseTest() {
        String pathToFile = "src/test/java/homeworks/homework_12/task_1/house_tests/house.json";
        String data;

        try {
            data = String.join("", Files.readAllLines(Paths.get(pathToFile)));
        } catch (IOException e) {
            throw new RuntimeException("Указан некорректный путь");
        }

        House house = (House) new JsonHelper().deserialize(data, House.class);

        Assertions.assertNotNull(house);
        Assertions.assertNotNull(house.getFlats());
        Assertions.assertNotNull(house.getFlats().get(0).getRooms());
        Assertions.assertNotNull(house.getFlats().get(1).getRooms());
        Assertions.assertNotNull(house.getFlats().get(2).getRooms());

        Assertions.assertEquals(3, house.getFlats().size());
        Assertions.assertEquals(2, house.getFlats().get(0).getRooms().size());
        Assertions.assertEquals(1, house.getFlats().get(1).getRooms().size());
        Assertions.assertEquals(3, house.getFlats().get(2).getRooms().size());

        Assertions.assertEquals(3, house.getFlats().get(0).getRooms().get(0).getWidth());
        Assertions.assertEquals(4, house.getFlats().get(0).getRooms().get(0).getHeight());

        Assertions.assertEquals(4, house.getFlats().get(0).getRooms().get(1).getWidth());
        Assertions.assertEquals(3, house.getFlats().get(0).getRooms().get(1).getHeight());


        Assertions.assertEquals(5, house.getFlats().get(1).getRooms().get(0).getWidth());
        Assertions.assertEquals(6, house.getFlats().get(1).getRooms().get(0).getHeight());


        Assertions.assertEquals(2, house.getFlats().get(2).getRooms().get(0).getWidth());
        Assertions.assertEquals(3, house.getFlats().get(2).getRooms().get(0).getHeight());

        Assertions.assertEquals(3, house.getFlats().get(2).getRooms().get(1).getWidth());
        Assertions.assertEquals(4, house.getFlats().get(2).getRooms().get(1).getHeight());

        Assertions.assertEquals(4, house.getFlats().get(2).getRooms().get(2).getWidth());
        Assertions.assertEquals(8, house.getFlats().get(2).getRooms().get(2).getHeight());
    }
}
