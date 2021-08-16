package com.kurdi.domaineventjava.controllers;

import com.kurdi.domaineventjava.domain.entities.Order;
import com.kurdi.domaineventjava.domain.services.TransactionService;
import com.kurdi.domaineventjava.infrastructure.repos.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {
    @Autowired
    TransactionService transactionService;
    @Autowired
    private ApplicationEventPublisher publisher;


    @GetMapping("/orders")
    public ResponseEntity<Order> order()
    {
        transactionService.trans2();
        return ResponseEntity.ok(null);

    }

    @GetMapping("/orderst")
    public ResponseEntity<Order> orderT()
    {

        if(transactionService.trans1() == null)
        {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(transactionService.trans1());
        }
        return ResponseEntity.ok(null);

    }
}
