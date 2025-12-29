package ru.practicum.lessonB.controller;

import ru.practicum.lessonB.service.ServiceB;
import ru.practicum.lessonB.service.ServiceBImpl;

public class ControllerB {

    public static ServiceB serviceB() {
        return new ServiceBImpl();
    }
}