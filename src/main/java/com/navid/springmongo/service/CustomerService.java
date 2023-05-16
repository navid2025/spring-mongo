package com.navid.springmongo.service;

import com.navid.springmongo.domain.Customer;
import com.navid.springmongo.repositories.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer findCustomerByFirstName(String name) {
        Optional<Customer> customer = customerRepo.findByFirstName(name);
        return customer.isPresent()?customer.get():null;
    }
}
