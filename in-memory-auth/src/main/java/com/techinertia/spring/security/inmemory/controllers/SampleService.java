package com.techinertia.spring.security.inmemory.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

@Service
public class SampleService {

    @PreAuthorize("true")
    public String hello(){
        return "Hello";
    }

    public String unsecured(){
        return "Hello unsecured";
    }

}
