package com.kurdi.domaineventjava;

import com.kurdi.domaineventjava.domain.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DomainEventJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomainEventJavaApplication.class, args);
	}

}
