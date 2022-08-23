package com.carfactory.service;

import com.carfactory.model.Customer;
import com.carfactory.model.Order;
import com.carfactory.model.Product;
import com.carfactory.model.ProductOption;
import com.carfactory.repository.CustomerRepository;
import com.carfactory.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    private OrderRepository orderRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository, OrderRepository orderRepository) {
        this.customerRepository = customerRepository;
        this.orderRepository = orderRepository;
    }

    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }


    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id){
        if(!customerRepository.existsById(id)){
            throw new IllegalStateException("Customer Not Found");
        }
        customerRepository.deleteById(id);
    }

    public Customer updateCustomer(Customer reqCustomer,Long id){
        if(!customerRepository.existsById(id)){
            throw new IllegalStateException("Customer Not Found");
        }

        return customerRepository.save(reqCustomer);
    }

    public Customer getCustomerById(Long id){
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if(!customerOptional.isPresent()){
            throw new IllegalStateException("Customer Not Found");
        }
        return customerOptional.get();
    }

    public List<Order> getOrdersByCustomerId(Long id){
        return orderRepository.findByCustomer_Id(id);
    }
}
