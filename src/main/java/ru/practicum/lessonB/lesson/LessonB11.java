package ru.practicum.lessonB.lesson;

import java.util.ArrayList;
import java.util.List;

import static ru.practicum.lessonB.controller.ControllerB.serviceB;

public class LessonB11 extends LessonB {
    @Override
    public void game() {
        System.out.println("11. Элементы, которые равны полусумме соседних элементов.");
        Integer[] numbers = {11, 22, 33, 44, 7};
        sortNum(numbers);
    }

    @Override
    public void sortNum(Integer[] numbers) {
        List<Number> list = new ArrayList<>();
        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] * 2 ==
                    numbers[i - 1] +
                            numbers[i + 1]) {
                list.add(numbers[i]);
            }
        }
        for (Number i : list) {
            System.out.print("\t" + i);
        }
    }


    public static void main(String[] args) {
        serviceB().lessonB11();
    }
}