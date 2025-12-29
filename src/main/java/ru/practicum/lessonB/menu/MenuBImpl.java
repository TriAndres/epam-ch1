package ru.practicum.lessonB.menu;

import static ru.practicum.console.Console.getString;
import static ru.practicum.lessonB.controller.ControllerB.serviceB;

public class MenuBImpl extends MenuB {
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
                7 - задача7.
                8 - задача8.
                9 - задача9.
                10 - задача10.
                11 - задача11.
                0 - выход из меню.
                """);
        return getString();
    }

    @Override
    public void select(String line) {
        switch (line) {
            case "1":
                serviceB().lessonB1();
                break;
            case "2":
                serviceB().lessonB2();
                break;
            case "3":
                serviceB().lessonB3();
                break;
            case "4":
                serviceB().lessonB4();
                break;
            case "5":
                serviceB().lessonB5();
                break;
            case "6":
                serviceB().lessonB6();
                break;
            case "7":
                serviceB().lessonB7();
                break;
            case "8":
                serviceB().lessonB8();
                break;
            case "9":
                serviceB().lessonB9();
                break;
            case "10":
                serviceB().lessonB10();
                break;
            case "11":
                serviceB().lessonB11();
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