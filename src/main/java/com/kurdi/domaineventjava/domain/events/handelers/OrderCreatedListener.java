package com.kurdi.domaineventjava.domain.events.handelers;

import com.kurdi.domaineventjava.domain.events.OrderCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class OrderCreatedListener {
    @EventListener
    void orderCreatedHandler(OrderCreatedEvent orderCreatedEvent)
    {
        System.out.print("Order Created!!!!");
    }
}
