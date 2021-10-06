package com.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    private static final String LOCAL_SERVER_PORT = "local.server.port";

    @Autowired
    private Environment environment;

    @Autowired
    private RestTemplate restTemplate;

   /* @RequestMapping(value = "/")
    public ResponseEntity getOrder() {
        return ResponseEntity.ok("Order Controller----> Port: " + environment.getProperty(LOCAL_SERVER_PORT));
    }*/


    @RequestMapping(value = "/")
    public ResponseEntity getOrderWithProducts() {
        String product = restTemplate.getForObject("http://product/", String.class);
        return ResponseEntity.ok("Order Controller----> Port: " + environment.getProperty(LOCAL_SERVER_PORT) + " " + product);
    }


}
