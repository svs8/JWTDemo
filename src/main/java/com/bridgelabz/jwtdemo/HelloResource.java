package com.bridgelabz.jwtdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "Hello World";
    }
}
