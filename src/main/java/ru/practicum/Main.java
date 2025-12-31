package ru.practicum;

import ru.practicum.lessonA.menu.MenuAImpl;
import ru.practicum.lessonB.menu.MenuBImpl;

import static ru.practicum.console.Console.getString;

public class Main {

    public static void main(String[] args) {
        new Main().game();
    }

    public void game() {
        while (true) {
            String line = menu();
            select(line);
            if (line.equals("0")) {
                break;
            }
        }
    }

    public String menu() {
        System.out.println("""
                1 - меню задач А.
                2 - меню задач В.
                0 - выход из программы.
                """);
        return getString();
    }

    public void select(String line) {
        switch (line) {
            case "1":
                new MenuAImpl().game();
                break;
            case "2":
                new MenuBImpl().game();
                break;
            case "0":
                System.out.println("выход из программы.");
                break;
            default:
                System.out.println("введите действующие данные.");
                break;
        }

    }
}