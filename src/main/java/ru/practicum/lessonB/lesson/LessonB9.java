package ru.practicum.lessonB.lesson;

import static ru.practicum.lessonB.controller.ControllerB.serviceB;

/*
Пример счастливого числа: 19.
Шаг 1: 1^2+9^2=82
Шаг 2: 8^2+2^2=68
Шаг 3: 6^2+8^2=100
Шаг 4: 1^2+0^2+0^2=1
Так как результатом стало число 1, значит число 19 — счастливое.
 */

public class LessonB9 extends LessonB {
    @Override
    public void game() {

        System.out.println("9. «Счастливые» числа.");
        Integer[] numbers = {19, 2};
        sortNum(numbers);
    }

    @Override
    public void sortNum(Integer[] numbers) {
        for (Integer number : numbers) {
            System.out.println("Число " + number + " счастливое? " + isHappy(number));
        }
    }

    static int sumDigitSquare(int n) {
        int sq = 0;
        while (n != 0) {
            int digit = n % 10;
            sq += digit * digit;
            n = n / 10;
        }
        return sq;
    }

    static boolean isHappy(int n) {
        while (true) {
            if (n == 1)
                return true;
            n = sumDigitSquare(n);
            if (n == 4)
                return false;
        }
    }

    public static void main(String[] args) {
        serviceB().lessonB9();
    }
}