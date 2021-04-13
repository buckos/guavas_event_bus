package com.example.guavas_event_bus.event;

public class BaseEvent {

    private final String message;

    public BaseEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
