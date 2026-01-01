package ru.practicum.lessonB.lesson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static ru.practicum.lessonB.controller.ControllerB.serviceB;

public class LessonB8 extends LessonB {
    @Override
    public void game() {
        System.out.println("8. Числа в порядке убывания частоты встречаемости чисел.");
        Integer[] numbers = {127, 122, 577988, 5};
        sortNum(numbers);
    }

    @Override
    public void sortNum(Integer[] numbers) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for (Integer number : numbers) {
            Map<String, Integer> map2 = new HashMap<>();
            String[] line = String.valueOf(number).split("");
            for (String s : line) {
                map2.put(s, map2.getOrDefault(s, 0) + 1);
            }
            map1.put(number, map2.values().size());
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map1.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<Integer, Integer> i : list) {
            System.out.print("\t" + i.getKey() + "-" + i.getValue());
        }
    }

    public static void main(String[] args) {
        serviceB().lessonB8();
    }
}