package ru.practicum.lessonB.lesson;

import static ru.practicum.lessonB.controller.ControllerB.serviceB;

public class LessonB2 extends LessonB {
    @Override
    public void game() {
        System.out.println("Наибольшее и наименьшее число.");
        Integer[] numbers = {1, 7, 2, 5};
        sortNum(numbers);
    }

    @Override
    public void sortNum(Integer[] numbers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Наибольшее число:");
        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);

        System.out.println("Наименьшее число:");
        for (Integer number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        serviceB().lessonB2();
    }
}