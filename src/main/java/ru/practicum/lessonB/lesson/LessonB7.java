package ru.practicum.lessonB.lesson;

import java.util.ArrayList;

import static ru.practicum.lessonB.controller.ControllerB.serviceB;

public class LessonB7 extends LessonB {
    @Override
    public void game() {
        System.out.println("7. Отсортированные числа в порядке возрастания и убывания.");
        Integer[] numbers = {3, 1, 2};
        sortNum(numbers);
    }

    @Override
    public void sortNum(Integer[] numbers) {
        ArrayList<Number> list = new ArrayList<>();
        for (Integer i : numbers) {
            list.add(Integer.parseInt(String.valueOf(i)));
        }
        System.out.println("В порядке возрастани:");
        list.sort((i1, i2) -> i1.intValue() - i2.intValue());
        for (Number number : list) {
            System.out.print("\t" + number);
        }
        System.out.println("\nВ порядке убывания:");
        list.sort((i1, i2) -> i2.intValue() - i1.intValue());
        for (Number number : list) {
            System.out.print("\t" + number);
        }
    }

    public static void main(String[] args) {
        serviceB().lessonB7();
    }
}