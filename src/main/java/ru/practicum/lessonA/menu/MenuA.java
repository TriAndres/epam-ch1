package ru.practicum.lessonA.menu;

import static ru.practicum.console.Console.getString;
import static ru.practicum.lessonA.controller.Controller.serviceA;

public class MenuA extends Menu{
    @Override
    public String menu() {
        System.out.println("""
                 Выбирите действие:
                1 - задача1.
                2 - задача2.
                3 - задача3.
                4 - задача4.
                5 - задача5.
                6 - задача6.
                0 - выход из меню.
                """);
        return getString();
    }

    @Override
    public void select(String line) {
        switch (line) {
            case "1":
                serviceA().lessonA1();
                break;
            case "2":
                serviceA().lessonA2();
                break;
            case "3":
                serviceA().lessonA3();
                break;
            case "4":
                serviceA().lessonA4();
                break;
            case "5":
                serviceA().lessonA5();
                break;
            case "6":
                serviceA().lessonA6();
                break;
            case "0":
                System.out.println("Выход из меню.");;
                break;
            default:
                System.out.println("Выбирите задачи из списка.");
                break;
        }
    }
}
