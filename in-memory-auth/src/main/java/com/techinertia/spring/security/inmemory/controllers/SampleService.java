package com.techinertia.spring.security.inmemory.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

@Service
public class SampleService {

    @PreAuthorize("isAnonymous()")
    public String hello(){
        return "Hello";
    }
}
