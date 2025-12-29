package ru.practicum.lessonA.lesson;

import java.util.ArrayList;
import java.util.List;

import static ru.practicum.console.Console.getInteger;
import static ru.practicum.lessonA.controller.ControllerA.serviceA;

public class LessonA3 extends LessonA {
    private final List<Integer> list = new ArrayList<>();

    @Override
    public void game() {
        System.out.println("3. Вывести заданное количество случайных чисел с переходом и без перехода \n" +
                "на новую строку. \n");
        System.out.println("Введите колтчество цифр n:");
        setRandomNum(1, 100);

        System.out.println("\nбез перехода:");
        showNum(0);

        System.out.println("\nс переходом");
        showNum(10);

    }

    public void setRandomNum(int from, int to) {
        int num = getInteger();
        for (int i = 0; i < num; i++) {
            int numRun = from + random.nextInt((to - from));
            list.add(numRun);
        }
    }

    public void showNum(int lineLength) {
        int count = 0;
        for (Integer numbers : list) {
            count++;
            System.out.print("\t" + numbers);
            if (count == lineLength) {
                System.out.println();
                count = 0;
            }
        }
    }

    public static void main(String[] args) {
        serviceA().lessonA3();
    }
}