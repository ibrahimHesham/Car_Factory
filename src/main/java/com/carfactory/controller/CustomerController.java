package com.carfactory.controller;

import com.carfactory.model.Customer;
import com.carfactory.model.Order;
import com.carfactory.model.Product;
import com.carfactory.model.ProductOption;
import com.carfactory.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @DeleteMapping(
            path = "{customerId}"
    )
    public void deleteCustomer(@PathVariable("customerId") Long id){
        customerService.deleteCustomer(id);
    }

    @PutMapping(
            path = "{customerId}"
    )
    public Customer updateCustomer(@RequestBody Customer customer, @PathVariable("customerId") Long id){
        return customerService.updateCustomer(customer, id);
    }

    @GetMapping(
            path = "{customerId}"
    )
    public Customer getCustomer(@PathVariable("customerId") Long id){
        return customerService.getCustomerById(id);
    }

    @GetMapping(
            path = "{customerId}/orders"
    )
    public List<Order> getProductOptionsByProductId(@PathVariable("customerId") Long id){
        return customerService.getOrdersByCustomerId(id);
    }


}
