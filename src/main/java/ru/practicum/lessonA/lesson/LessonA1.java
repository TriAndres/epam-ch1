package ru.practicum.lessonA.lesson;

import static ru.practicum.console.Console.getString;
import static ru.practicum.lessonA.controller.ControllerA.serviceA;

public class LessonA1 extends LessonA {
    @Override
    public void game() {
        System.out.println("1. Приветствовать любого пользователя при вводе его имени через командную строку.\n");
        System.out.println("Введите ваше имя:");
        String name = getString();
        System.out.println(name + ", вас приветствую!");
    }

    public static void main(String[] args) {
        serviceA().lessonA1();
    }
}