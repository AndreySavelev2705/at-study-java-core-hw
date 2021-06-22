package homeworks.homework_6.task_3;

import java.util.ArrayList;
import java.util.Random;

public enum Lesson {
    MATHEMATICS,
    PHYSICS,
    PROGRAMMING,
    HISTORY,
    BIOLOGY,
    GEOGRAPHY;

    public static ArrayList<Lesson> generateRandomListOfLessons() {
        int numberOfLessons = new Random().nextInt(3) + 4;
        Lesson[] allLesson = Lesson.values();
        ArrayList<Lesson> lessons = new ArrayList<>(numberOfLessons);

        for (int i = 0; i < numberOfLessons; i++) {
            int index = new Random().nextInt(allLesson.length);
            lessons.add(allLesson[index]);
        }
        return lessons;
    }
}
