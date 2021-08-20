package homeworks.homework_9.task_4.distributors;

import homeworks.homework_9.task_4.cookers.Cooker;

import java.util.List;

public interface CookChooser {

    Cooker chooseCooker(List<Cooker> cookers);
}
