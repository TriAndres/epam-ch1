package ru.practicum.lessonB.lesson;

import static ru.practicum.lessonB.controller.ControllerB.serviceB;

public class LessonB6 extends LessonB {

    @Override
    public void game() {
        System.out.println("6. Простые числа.");
        Integer[] numbers = {1, 2, 11, 15, 13, 107};
        sortNum(numbers);
    }

    @Override
    public void sortNum(Integer[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            boolean flag = true;
            for (int j = 2; j * j < numbers[i]; j++) {
                if (numbers[i] % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (numbers[i] <= 1) {
                flag = false;
            }
            if (flag) {
                System.out.print("\t" + numbers[i]);
            }
        }
    }

    public static void main(String[] args) {
        serviceB().lessonB6();
    }
}