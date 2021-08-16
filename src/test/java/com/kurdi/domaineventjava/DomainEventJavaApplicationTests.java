package com.kurdi.domaineventjava;

import com.kurdi.domaineventjava.domain.entities.Order;
import com.kurdi.domaineventjava.infrastructure.repos.OrderRepo;
import org.aspectj.weaver.ast.Or;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;

@SpringBootTest
class DomainEventJavaApplicationTests {


	@Autowired
	Order order;
	@Autowired
	OrderRepo orderRepo;
	@Autowired
	private ApplicationEventPublisher publisher;


	@Test
	void orderCreated() {
		Order oc = Order.builder().customerName("sheriff").build();
		oc.orderCreated(publisher);
	}

}
