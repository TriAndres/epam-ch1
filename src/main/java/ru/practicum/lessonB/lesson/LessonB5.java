package ru.practicum.lessonB.lesson;

import static ru.practicum.lessonB.controller.ControllerB.serviceB;

public class LessonB5 extends LessonB {
    @Override
    public void game() {
        System.out.println("5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.");
        Integer[] numbers = {123, 233, 56, 765};
        sortNum(numbers);
    }

    @Override
    public void sortNum(Integer[] numbers) {
        for (Integer number : numbers) {
            if (String.valueOf(number).length() == 3) {
                String[] list1 = String.valueOf(number).split("");
                if (!list1[0].equals(list1[1]) && !list1[1].equals(list1[2]) && !list1[2].equals(list1[0])) {
                    System.out.print("\t" + number);
                }
            }
        }
    }

    public static void main(String[] args) {
        serviceB().lessonB5();
    }
}