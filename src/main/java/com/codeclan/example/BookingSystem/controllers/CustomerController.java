package com.codeclan.example.BookingSystem.controllers;


import com.codeclan.example.BookingSystem.models.Customer;
import com.codeclan.example.BookingSystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value="/customers")
    public ResponseEntity<List<Customer>> getAllCustomers(
            @RequestParam(name="course", required = false) String course
    ){
        if(course != null){
            return new ResponseEntity<>(customerRepository.findByBookingsCourseName(course), HttpStatus.OK);
        }
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }

}
