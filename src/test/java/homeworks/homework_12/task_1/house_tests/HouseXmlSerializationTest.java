package homeworks.homework_12.task_1.house_tests;

import homeworks.homework_12.task_1.helpers.XmlHelper;
import homeworks.homework_12.task_1.model.House;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HouseXmlSerializationTest {

    @Test
    @DisplayName("Сериализация дома в XML файл")
    public void serializeToXmlHouseTest() {
        String pathToFile = "src/test/java/homeworks/homework_12/task_1/house_tests/expected_xml.txt";

        House house = new House().generate();

        XmlHelper xmlHelper = new XmlHelper();
        String xmlHouse = xmlHelper.serialize(house);

        try (FileWriter fileWriter = new FileWriter(pathToFile)) {
            fileWriter.write(xmlHouse);
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException("Указан некорректный путь");
        }

        String expected;
        try {
            //expected = new String(Files.readAllBytes(Paths.get(pathToFile)));
            expected = String.join("", Files.readAllLines(Paths.get(pathToFile)));
        } catch (IOException e) {
            throw new RuntimeException("Указан некорректный путь");
        }

        Assertions.assertEquals(expected, xmlHouse);
    }
}
