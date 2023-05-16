package com.navid.springmongo.controller;

import com.navid.springmongo.domain.Customer;
import com.navid.springmongo.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "/customer/{name}", produces = "application/json")
    public Customer findCustomerById(@PathVariable String name) {
        return customerService.findCustomerByFirstName(name);
    }
}
