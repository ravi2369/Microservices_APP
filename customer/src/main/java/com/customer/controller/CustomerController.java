package com.customer.controller;

import com.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    public ResponseEntity getAllCustomers(){
        return ResponseEntity.ok(this.customerService.findAll());
    }
}
