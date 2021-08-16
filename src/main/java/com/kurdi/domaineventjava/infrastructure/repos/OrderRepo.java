package com.kurdi.domaineventjava.infrastructure.repos;

import com.kurdi.domaineventjava.domain.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer> {
}
