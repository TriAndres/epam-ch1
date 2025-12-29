package ru.practicum;

import static ru.practicum.console.Console.getString;

public class Main {

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

        return getString();
    }

    public void select(String line) {


    }

    public static void main(String[] args) {

    }
}