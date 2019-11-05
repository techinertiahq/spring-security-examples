package com.techinertia.spring.security.inmemory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @Autowired
    SampleService sampleService;

    @RequestMapping("/api/home")
    public String home() {
        return sampleService.hello();
    }

    @RequestMapping("/unsecured")
    public String unsecured() {
        return sampleService.unsecured();
    }

    @RequestMapping("/api/secure")
    public String secure() {
        return "Secure";
    }
}
