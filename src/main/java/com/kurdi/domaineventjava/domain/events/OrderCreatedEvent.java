package com.kurdi.domaineventjava.domain.events;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class OrderCreatedEvent extends ApplicationEvent {
    public OrderCreatedEvent(Object source) {
        super(source);
    }
}
