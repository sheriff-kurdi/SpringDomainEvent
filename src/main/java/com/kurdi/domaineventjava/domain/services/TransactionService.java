package com.kurdi.domaineventjava.domain.services;

import com.kurdi.domaineventjava.domain.entities.Item;
import com.kurdi.domaineventjava.domain.entities.Order;
import com.kurdi.domaineventjava.infrastructure.repos.ItemsRepo;
import com.kurdi.domaineventjava.infrastructure.repos.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
public class TransactionService {

    @Autowired
    OrderRepo orderRepo;
    @Autowired
    ItemsRepo itemsRepo;
    @Autowired
    ApplicationEventPublisher publisher;

    public Order trans1()
    {
        Item i = Item.builder().itemName("item one").build();
        Order o = Order.builder().customerName("sheriff").build();
        orderRepo.save(o);
        try {
            System.out.print(1/0);

        }catch (Exception e)
        {
            return null;
        }
        itemsRepo.save(i);
        o.orderCreated(publisher);
        return o;

    }

    public void trans2()
    {
        Item i = Item.builder().itemName("item one").build();
        Order o = Order.builder().customerName("sheriff").build();
        itemsRepo.save(i);
        System.out.print(1/0);
        orderRepo.save(o);
    }


}
