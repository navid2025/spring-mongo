package com.navid.springmongo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Slf4j
@Document
public class Customer {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String address;
}
