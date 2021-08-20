package homeworks.homework_10.task_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileHelper {

    public static Map<String, String> readFile(File file) throws IOException {
        Path path = Paths.get(file.getAbsolutePath());
        List<String> input = Files.readAllLines(path);
        Map<String, String> content = new HashMap<>();
        for (String line : input) {
            String key = line.split("=")[0];
            if (line.contains("=") && line.split("=").length == 1) {
                content.put(key, "[]");
                continue;
            }
            String value = parse(line.split("=")[1]);
            content.put(key, value);
        }
        return content;
    }

    private static String parse (String value) {
        // То что возвращать, Если не дробное, не целове и не булиан
        String defaultValue = "\"" + value + "\"";

        if (value == null) {
            return  null;
        }
        if (value.equals("")) {
            return "[]";
        }
        // Проверка на дробное число
        if (value.contains(".")) {
            try {
                return String.valueOf(Double.parseDouble(value));
            } catch (NumberFormatException nfe) {
                return  defaultValue;
            }
        }
        //Проверка на целое число
        try {
            return String.valueOf(Integer.parseInt(value));
        } catch (NumberFormatException nfe) {
        }
        //Проверка на булиан
        return value.equals("true") || value.equals("false")
                ? value
                : defaultValue;
    }

    public static void saveFile(File file, Map<String, String> content) {
        String output = stringBuilder(content);
        System.out.println(output);

        try(FileWriter writer = new FileWriter(file)) {
            writer.write(output);
            writer.flush();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static String stringBuilder(Map<String, String> content) {
        StringBuilder stringBuilder = new StringBuilder("{"); //для склейки сторк
        stringBuilder.append(System.lineSeparator()); // универсальный перенос строки

        for (Map.Entry<String, String> entry : content.entrySet()) {
            stringBuilder.append(String.format(" \"%s\": %s,%n", entry.getKey(), entry.getValue()));

        }

        int lastComma = stringBuilder.lastIndexOf(",");
        stringBuilder.replace(lastComma, lastComma + 1, "");
        stringBuilder.append("}");

        String output = stringBuilder.toString();

        return output;
    }
}
