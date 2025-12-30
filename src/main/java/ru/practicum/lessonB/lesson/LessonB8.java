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
        Integer[] numbers = {122, 122, 255, 57788};
        //sortNum(numbers);
    }

    @Override
    public void sortNum(Integer[] numbers) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (Integer number : numbers) {
//            if (!map.containsKey(number)) {
//                map.put(number, 1);
//            } else {
//                map.put(number, map.get(number) + 1);
//            }
//        }
//
//        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
//
//        for (Map.Entry<Integer, Integer> i : list) {
//            System.out.print("\t" + i);
//        }
//
//        System.out.println();
//
//        list.sort((a, b) -> {
//            if (b.getValue().equals(a.getValue())) return b.getKey() - a.getKey();
//            else return a.getValue() - b.getValue();
//        });
//
//        for (Map.Entry<Integer, Integer> i : list) {
//            System.out.print("\t" + i);
//        }
//
//        System.out.println();
    }

    public static void main(String[] args) {
        serviceB().lessonB8();
    }
}