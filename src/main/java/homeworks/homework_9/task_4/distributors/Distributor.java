package homeworks.homework_9.task_4.distributors;

import homeworks.homework_9.task_4.cookers.Cooker;
import homeworks.homework_9.task_4.food.Food;

import java.util.List;

public abstract class Distributor implements CookChooser {

    public void addFood(Food food, List<Cooker> cookers) {
        chooseCooker(cookers).addFood(food);
    }
}
