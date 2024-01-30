package com.erojas.lab.appserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.erojas.lab.appserver.properties.ServiceProperties;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RestController
@RequestMapping("/server")
public class HelloController {

    @Autowired
    private ServiceProperties serviceProperties;

    @GetMapping("/hello")
    public String sayHello(@RequestParam(name = "name", required = false) String name) {
        log.info("Current profile is: {}", serviceProperties.getProfile());
        return "Hello ".concat(name);
    }
}
