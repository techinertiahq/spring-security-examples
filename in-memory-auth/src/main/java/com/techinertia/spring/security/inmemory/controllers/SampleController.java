package com.techinertia.spring.security.inmemory.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @RequestMapping("/home")
    public String home() {
        return "Home";
    }

    @RequestMapping("/secure")
    public String secure() {
        return "Secure";
    }
}
