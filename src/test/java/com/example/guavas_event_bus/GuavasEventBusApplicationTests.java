package com.example.guavas_event_bus;

import com.example.guavas_event_bus.event.ExampleMessageEvent;
import com.example.guavas_event_bus.listener.ExampleMessageListener;
import com.google.common.eventbus.EventBus;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GuavasEventBusApplicationTests {

    @Test
    void contextLoads() {
        EventBus bus = new EventBus();

        ExampleMessageListener listener = new ExampleMessageListener();

        bus.register(listener);

        ExampleMessageEvent event = new ExampleMessageEvent("helo te is mit csinalsz");
        bus.post(event);

        assertEquals(event.getMessage(), listener.getMessage());
    }

}
