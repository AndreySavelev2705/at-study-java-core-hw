package homeworks.homework_12.task_1.model;

public interface Generatable<T extends  Generatable> {

    T generate();
}
