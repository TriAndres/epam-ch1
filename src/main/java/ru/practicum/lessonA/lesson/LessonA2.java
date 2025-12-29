package ru.practicum.lessonA.lesson;

import static ru.practicum.console.Console.getString;
import static ru.practicum.lessonA.controller.ControllerA.serviceA;

public class LessonA2 extends LessonA {
    @Override
    public void game() {
        System.out.println("2. Отобразить в окне консоли аргументы командной строки в обратном порядке.");

        System.out.println("Введите аргументы:");
        String name = getString();
        char[] value = name.toCharArray();
        System.out.println("В обратном порядке:");
        for (int i = value.length; i > 0 ; i--) {
            System.out.print(i + "\t");
        }
    }

    public static void main(String[] args) {
        serviceA().lessonA2();
    }
}