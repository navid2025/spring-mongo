package com.navid.springmongo;

import com.navid.springmongo.domain.Customer;
import com.navid.springmongo.repositories.CustomerRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Slf4j
public class DataInitializer implements ApplicationRunner {

    private final CustomerRepo repo;

    public DataInitializer(CustomerRepo repo) {
        log.debug("start");
        this.repo = repo;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        log.debug("run");
        Customer customer1 = new Customer();
        customer1.setFirstName("saba");
        customer1.setLastName("ghashi");
        customer1.setAddress("sazman-barname-shomali");
        repo.save(customer1);
    }
}
