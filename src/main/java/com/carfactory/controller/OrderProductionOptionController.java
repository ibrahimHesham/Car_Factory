package com.carfactory.controller;

import com.carfactory.model.OrderProductionOption;
import com.carfactory.model.Product;
import com.carfactory.service.OrderProductionOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/orderproductionoption")
public class OrderProductionOptionController {

    private OrderProductionOptionService orderProductionOptionService;

    @Autowired
    public OrderProductionOptionController(OrderProductionOptionService orderProductionOptionService) {
        this.orderProductionOptionService = orderProductionOptionService;
    }

    @GetMapping
    public List<OrderProductionOption> getOrderProductionOption(){
        return orderProductionOptionService.getOrderProductionOption();
    }

    @PostMapping
    public OrderProductionOption addOrderProductionOption(@RequestBody OrderProductionOption orderProductionOption){

        return orderProductionOptionService.addOrderProductionOption(orderProductionOption);
    }
}
