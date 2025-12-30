package ru.practicum.lessonB.lesson;

import java.util.ArrayList;
import java.util.List;

import static ru.practicum.lessonB.controller.ControllerB.serviceB;

public class LessonB11 extends LessonB {
    @Override
    public void game() {
        System.out.println("11. Элементы, которые равны полусумме соседних элементов.");
        Integer[] numbers = {1, 2};
        sortNum(numbers);
    }

    @Override
    public void sortNum(Integer[] numbers) {
        List<Number> list = new ArrayList<>();
//            for (int i = 1; i < numbersFile.findAll().size() - 1; i++) {
//                if (numbersFile.findAll().get(i).getNum() * 2 ==
//                        numbersFile.findAll().get(i - 1).getNum() +
//                                numbersFile.findAll().get(i + 1).getNum()) {
//                    list.add(numbersFile.findAll().get(i));
//                }
//            }
        for (Number i : list) {
            System.out.println("\t" + i);
        }
    }


    public static void main(String[] args) {
        serviceB().lessonB11();
    }
}