package ru.practicum.lessonA.lesson;

import java.util.Random;

public abstract class LessonA {
    protected Random random ;

    public LessonA() {
        random = new Random();
    }
    abstract void game();
}
