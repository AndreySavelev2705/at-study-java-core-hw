package homeworks.homework_12.task_1.room_tests;

import homeworks.homework_12.task_1.helpers.JsonHelper;
import homeworks.homework_12.task_1.model.Room;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RoomJsonDeserializationTest {
    
    @Test
    @DisplayName("Десериализация комнаты из Json файла")
    public void deserializationFromJsonRoomTest() {
        String pathToFile = "src/test/java/homeworks/homework_12/task_1/room_tests/room.json";
        String data;

        try {
            data = String.join("", Files.readAllLines(Paths.get(pathToFile)));
        } catch (IOException e) {
            throw new RuntimeException("Указан некорректный путь");
        }

        Room room = (Room) new JsonHelper().deserialize(data, Room.class);

        Assertions.assertNotNull(room);
        Assertions.assertEquals(5, room.getHeight());
        Assertions.assertEquals(6, room.getWidth());
    }
}
