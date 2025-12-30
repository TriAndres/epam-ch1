package ru.practicum.lessonB.lesson;

import java.util.ArrayList;
import java.util.List;

import static ru.practicum.lessonB.controller.ControllerB.serviceB;

public class LessonB10 extends LessonB {

    @Override
    public void game() {
        System.out.println("10. Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.");
        Integer[] numbers = {121, 255, 45654};
        sortNum(numbers);
    }

    @Override
    public void sortNum(Integer[] numbers) {
        List<Integer> num = new ArrayList<>();
        for (Integer number : numbers) {
            String num1 = String.valueOf(number);
            StringBuilder builder = new StringBuilder().append(num1);
            String num2 = builder.reverse().toString();
            if (num1.equals(num2)) {
                num.add(number);
            }
        }
        for (Integer i : num) {
            System.out.print("\t" + i);
        }
    }


    public static void main(String[] args) {
        serviceB().lessonB10();
    }
}
