package com.carfactory.service;

import com.carfactory.model.OrderProductionOption;
import com.carfactory.model.OrderProductionOptionId;
import com.carfactory.model.Product;
import com.carfactory.repository.OrderProductionOptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProductionOptionService {

    private OrderProductionOptionRepository orderProductionOptionRepository;

    @Autowired
    public OrderProductionOptionService(OrderProductionOptionRepository orderProductionOptionRepository) {
        this.orderProductionOptionRepository = orderProductionOptionRepository;
    }

    public List<OrderProductionOption> getOrderProductionOption(){
        List<OrderProductionOption> orderProductionOptionsList = orderProductionOptionRepository.findAll();
        return orderProductionOptionsList;
    }

    public OrderProductionOption addOrderProductionOption(OrderProductionOption orderProductionOption){

        return orderProductionOptionRepository.save(orderProductionOption);
    }
}
