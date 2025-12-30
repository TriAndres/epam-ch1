package ru.practicum.lessonB.lesson;

import static ru.practicum.lessonB.controller.ControllerB.serviceB;

public class LessonB3 extends LessonB {
    @Override
    public void game() {
        Integer[] numbers = {1, 2, 9, 27, 6};
        sortNum(numbers);
    }

    @Override
    public void sortNum(Integer[] numbers) {
        System.out.println("3. Числа, которые делятся на 3 или на 9.");
        for (Integer number : numbers) {
            if (number % 3 == 0 ) {
                System.out.print("\t" + number);
            }
        }
    }

    public static void main(String[] args) {
        serviceB().lessonB3();
    }
}