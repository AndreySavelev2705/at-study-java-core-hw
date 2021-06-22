package homeworks.homework_6.task_3;

import java.util.ArrayList;
import java.util.Map;

public class Scholar {
    private Map<DayOfWeek, ArrayList<Lesson>> diary;

    public Map<DayOfWeek, ArrayList<Lesson>> getDiary() {
        return diary;
    }

    public Scholar setDiary(Map<DayOfWeek, ArrayList<Lesson>> diary) {
        this.diary = diary;
        return this;
    }
}
