package ru.practicum.lessonA.controller;

import ru.practicum.lessonA.service.ServiceA;
import ru.practicum.lessonA.service.ServiceAImpl;

public class ControllerA {

    public static ServiceA serviceA() {
        return new ServiceAImpl();
    }
}