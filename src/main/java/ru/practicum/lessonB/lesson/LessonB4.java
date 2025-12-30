package ru.practicum.lessonB.lesson;

import static ru.practicum.lessonB.controller.ControllerB.serviceB;

public class LessonB4 extends LessonB {

    @Override
    public void game() {
        Integer[] numbers = {1, 35, 9, 10, 5};
        sortNum(numbers);
    }

    @Override
    public void sortNum(Integer[] numbers) {
        System.out.println("4. Числа, которые делятся на 5 и на 7.");
        for (Integer number : numbers) {
            if (number % 5 == 0 && number % 7 == 0) {
                System.out.print("\t" + number);
            }
        }
    }
    public static void main(String[] args) {
        serviceB().lessonB4();
    }
}