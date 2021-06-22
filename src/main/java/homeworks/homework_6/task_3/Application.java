package homeworks.homework_6.task_3;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Application {
    public static void main(String[] args) {
        Map<DayOfWeek, ArrayList<Lesson>> diary = new TreeMap<>();
        DayOfWeek[] dayOfWeeks = DayOfWeek.values();
        Scholar scholar = new Scholar();

        for (int i = 0; i < dayOfWeeks.length; i++) {
            ArrayList<Lesson> lessons = Lesson.generateRandomListOfLessons();

            diary.put(dayOfWeeks[i], lessons);
        }

        scholar.setDiary(diary);

        for (Map.Entry<DayOfWeek, ArrayList<Lesson>> map : scholar.getDiary().entrySet()) {
            DayOfWeek dayOfWeek = map.getKey(); // Получение текущего дня
            ArrayList<Lesson> lessons = map.getValue(); // Получение всех уроков на текущий день
            System.out.printf("%s: ", dayOfWeek.name());
            int index = 0;
            for (Lesson lesson : lessons) {
                if (index == lessons.size() - 1) {
                    System.out.printf("%s ", lesson.name());
                    break;
                }
                System.out.printf("%s, ", lesson.name());
                index++;
            }
            System.out.println();
        }



        Map<Lesson, Integer> numberOfLessons = new TreeMap<>();

        //Берем урок
        for (Lesson lesson : Lesson.values()) {
            int countOfCurrentLesson = 0; // Счетчик для нашего урока
            for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
                ArrayList<Lesson> lessons = scholar.getDiary().get(dayOfWeek); // Получаем список уроков в выбранный день(День - ключ, по нему и берется значение)
                for (Lesson currentLesson :  lessons) { // Сравниваем взятый урок с каждым уроком в выбранный день
                    if (currentLesson == lesson) {
                        countOfCurrentLesson++;
                    }
                }
            }
            numberOfLessons.put(lesson, countOfCurrentLesson);
        }

        System.out.println();

        for (Map.Entry<Lesson, Integer> lessonIntegerEntry : numberOfLessons.entrySet()) {
            System.out.printf("%s : %d%n", lessonIntegerEntry.getKey(), lessonIntegerEntry.getValue());
        }
    }
}
