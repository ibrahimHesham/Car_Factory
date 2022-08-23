package com.carfactory.service;


import com.carfactory.model.Customer;
import com.carfactory.model.Order;
import com.carfactory.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrder(){
        return orderRepository.findAll();
    }


    public Order addOrder(Order order){
        return orderRepository.save(order);
    }
}
