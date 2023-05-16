package com.navid.springmongo.repositories;

import com.navid.springmongo.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, String> {
    Optional<Customer> findByFirstName(String firstName);
}
