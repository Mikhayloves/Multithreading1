package org.sberuniversity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Factorial implements Serializable {
    private final List<Integer> list = new ArrayList<>();

    public void save(int number) {
        list.add(number);
    }

    public List<Integer> getNumbers() {
        System.out.println("Список чисел: " + list); // Для отладки
        return new ArrayList<>(list);
    }
}

