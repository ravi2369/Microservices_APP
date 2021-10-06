package com.customer.service.support;

import com.customer.model.Customer;
import com.customer.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer create(Customer customer) {
        return null;
    }

    @Override
    public Customer findbyId(String id) {
        return null;
    }

    @Override
    public List<String> findAll() {
        return null;
    }
}
