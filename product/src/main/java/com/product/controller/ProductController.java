package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private static final String LOCAL_SERVER_PORT = "local.server.port";

    @Autowired
    private Environment environment;

    @RequestMapping(value = "/")
    public ResponseEntity getProduct() {
        return ResponseEntity.ok("Product Controller----> Port: " + environment.getProperty(LOCAL_SERVER_PORT));
    }
}
