package com.etiya.productservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productservice")
@RequiredArgsConstructor
public class ProductController {

    @GetMapping("/hello")
    public String hello(){
        return "hello productservice";
    }
}
