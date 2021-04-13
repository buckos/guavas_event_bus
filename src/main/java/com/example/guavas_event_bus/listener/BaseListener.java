package com.example.guavas_event_bus.listener;

import com.example.guavas_event_bus.event.ExampleMessageEvent;
import com.google.common.eventbus.Subscribe;

public class BaseListener {

    protected String message;

    @Subscribe
    private void general(ExampleMessageEvent event) {
        message = event.getMessage();
    }

    public String getMessage() {
        return message;
    }
}
