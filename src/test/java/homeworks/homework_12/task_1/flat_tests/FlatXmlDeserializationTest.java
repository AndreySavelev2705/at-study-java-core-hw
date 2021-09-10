package homeworks.homework_12.task_1.flat_tests;

import homeworks.homework_12.task_1.helpers.XmlHelper;
import homeworks.homework_12.task_1.model.Flat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FlatXmlDeserializationTest {

    @Test
    @DisplayName("Десериализация квартиры из Оыщт файла")
    public void deserializationFromXmlFlatTest() {
        String pathToFile = "src/test/java/homeworks/homework_12/task_1/flat_tests/flat.xml";
        String data;

        try {
            data = String.join("", Files.readAllLines(Paths.get(pathToFile)));
        } catch (IOException e) {
            throw new RuntimeException("Указан некорректный путь");
        }

        Flat flat = (Flat) new XmlHelper().deserialize(data, Flat.class);

        Assertions.assertNotNull(flat);
        Assertions.assertNotNull(flat.getRooms());
        Assertions.assertEquals(3, flat.getRooms().size());

        Assertions.assertEquals(4, flat.getRooms().get(0).getWidth());
        Assertions.assertEquals(3, flat.getRooms().get(0).getHeight());

        Assertions.assertEquals(6, flat.getRooms().get(1).getWidth());
        Assertions.assertEquals(5, flat.getRooms().get(1).getHeight());

        Assertions.assertEquals(2, flat.getRooms().get(2).getWidth());
        Assertions.assertEquals(3, flat.getRooms().get(2).getHeight());
    }
}
