package com.example.guavas_event_bus.listener;

import com.example.guavas_event_bus.event.ExampleMessageEvent;
import com.google.common.eventbus.Subscribe;

public class ExampleMessageListener extends BaseListener{

    @Subscribe
    private void exclusive(ExampleMessageEvent event) {
        message = event.getMessage();
    }
}
