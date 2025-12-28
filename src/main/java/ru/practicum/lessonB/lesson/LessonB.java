package ru.practicum.lessonB.lesson;

import java.util.Random;

public abstract class LessonB {
    protected Random random ;

    public LessonB() {
        random = new Random();
    }
    abstract void game();
}