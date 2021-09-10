package homeworks.homework_12.task_1.room_tests;

import homeworks.homework_12.task_1.helpers.XmlHelper;
import homeworks.homework_12.task_1.model.Room;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RoomXmlDeserializationTest {
    
    @Test
    @DisplayName("Десериализация комнаты из Json файла")
    public void deserializationFromXmlRoomTest() {
        String pathToFile = "src/test/java/homeworks/homework_12/task_1/room_tests/room.xml";
        String data;

        try {
            data = String.join("", Files.readAllLines(Paths.get(pathToFile)));
        } catch (IOException r) {
            throw new RuntimeException("Указан некорректный путь");
        }

        Room room = (Room) new XmlHelper().deserialize(data, Room.class);

        Assertions.assertNotNull(room);
        Assertions.assertEquals(5, room.getHeight());
        Assertions.assertEquals(6, room.getWidth());
    }
}
