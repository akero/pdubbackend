package com.propdub.app.controller;

import com.propdub.app.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controller {

    private final service service;

    @Autowired
    public controller(service service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public String hello() {
        return service.sayHello();
    }
}
