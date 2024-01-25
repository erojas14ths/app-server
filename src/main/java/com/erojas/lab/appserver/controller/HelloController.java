package com.erojas.lab.appserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/server")
public class HelloController {


    @GetMapping("/hello")
    public String sayHello(@RequestParam(name = "name", required = false) String name) {
        return "Hello ".concat(name);
    }
}
