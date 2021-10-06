package com.customer.service;

import com.customer.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomerService {
    Customer create(Customer customer);
    Customer findbyId(String id);
    List<String> findAll();
}
