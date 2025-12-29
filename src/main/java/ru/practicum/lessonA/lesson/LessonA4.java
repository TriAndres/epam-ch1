package ru.practicum.lessonA.lesson;

import static ru.practicum.console.Console.getString;
import static ru.practicum.lessonA.controller.ControllerA.serviceA;

public class LessonA4 extends LessonA {
    @Override
    public void game() {
        System.out.println("4. Ввести пароль из командной строки и сравнить его со строкой-образцом. \n");

        String password = "password";
        System.out.println("Введите пароль:");
        String name = getString();
        if (password.equals(name)) {
            System.out.println("пароль верный!");
        } else {
            System.out.println("попробуйте заново ввести пароль.");
        }
    }

    public static void main(String[] args) {
        serviceA().lessonA4();
    }
}