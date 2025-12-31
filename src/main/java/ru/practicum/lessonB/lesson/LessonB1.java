package ru.practicum.lessonB.lesson;

import static ru.practicum.lessonB.controller.ControllerB.serviceB;

public class LessonB1 extends LessonB {
    @Override
    public void game() {
        System.out.println("1. Четные и нечетные числа. \n");
        Integer[] numbers = {1, 2};
        sortNum(numbers);
    }

    @Override
    public void sortNum(Integer[] numbers) {

        System.out.println("Четные числа:");
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.print("\t" + number);
            }
        }
        System.out.println("\nНечетные числа:");
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                System.out.print("\t" + number);
            }
        }
    }

    public static void main(String[] args) {
        serviceB().lessonB1();
    }
}