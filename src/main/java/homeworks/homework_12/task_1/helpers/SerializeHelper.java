package homeworks.homework_12.task_1.helpers;

import homeworks.homework_12.task_1.model.Generatable;

public interface SerializeHelper<T extends Generatable> {

    T deserialize(String data, Class<T> clazz);

    String serialize(T object);
}
