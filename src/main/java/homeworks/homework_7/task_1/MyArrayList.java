package homeworks.homework_7.task_1;

import java.util.ArrayList;

public class MyArrayList<T> extends ArrayList<T> {

    @Override
    public T get(int index) {
        T element;
        try {
            element = super.get(index);
        } catch (IndexOutOfBoundsException ioobe) {
            return null;
        }
        System.out.printf("Получен объект %s из списка%n", super.get(index));
        return element;
    }

    @Override
    public boolean add(T t) {
        System.out.printf("Добавлен объект %s в список%n", t);
        return super.add(t);
    }

    @Override
    public void add(int index, T element) {
        try {
            super.add(index, element);
            System.out.printf("Добавлен объект %s в список на позицию %d%n", element, index);
        } catch (IndexOutOfBoundsException ioobe) {
            super.add(0, element);
            System.out.printf("Добавлен объект %s в список на позицию %d%n", element, 0);
        }
    }

    @Override
    public int size() {
        System.out.printf("Размер списка: %d%n", super.size());
        return super.size();
    }

    @Override
    public boolean contains(Object o) {
        if (super.contains(o)) {
            System.out.printf("Объект содержится в списке%n", super.size());
            return super.contains(o);
        }
        System.out.printf("Объект не содержится в списке%n", super.size());
        return super.contains(o);
    }
}
