package com.kurdi.domaineventjava.domain.entities;

import com.kurdi.domaineventjava.domain.events.OrderCreatedEvent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import javax.persistence.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Component
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    Integer id;
    @Column(name = "customer_name")
    String customerName;
    public void orderCreated(ApplicationEventPublisher publisher)
    {
        publisher.publishEvent(new OrderCreatedEvent(this));
    }

}
