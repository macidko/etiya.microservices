package com.etiya.customerservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customerservice")
@RequiredArgsConstructor
public class CustomerController {

    @GetMapping("/hello")
    public String hello(){
        return "hello customerservice";
    }
    @GetMapping("/sa")
    public String sa(){
        return "sa customerservice";
    }
}
