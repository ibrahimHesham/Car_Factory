package com.carfactory.service;

import com.carfactory.model.Customer;
import com.carfactory.model.ProductOption;
import com.carfactory.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }


    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }
}
