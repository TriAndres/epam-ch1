package ru.practicum.lessonA.service;

import ru.practicum.lessonA.lesson.*;

public class ServiceAImpl implements ServiceA {
    @Override
    public void lessonA1() {
        new LessonA1().game();
    }

    @Override
    public void lessonA2() {
        new LessonA2().game();
    }

    @Override
    public void lessonA3() {
        new LessonA3().game();
    }

    @Override
    public void lessonA4() {
        new LessonA4().game();
    }

    @Override
    public void lessonA5() {
        new LessonA5().game();
    }

    @Override
    public void lessonA6() {
        new LessonA6().game();
    }
}
