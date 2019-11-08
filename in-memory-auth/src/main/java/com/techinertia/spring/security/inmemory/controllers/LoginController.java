package com.techinertia.spring.security.inmemory.controllers;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class LoginController {

    @GetMapping("/signin")
    public String welcome(){
        return "signin";
    }

    @PostMapping("/login")
    public String login() {

        List<GrantedAuthority> AUTHORITIES = new ArrayList<>();
        AUTHORITIES.add(new SimpleGrantedAuthority("ROLE_USER"));

        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken= new UsernamePasswordAuthenticationToken("admin", "amdin", AUTHORITIES);
        SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);

        HashMap<String,String > map=new HashMap<>();
        map.put("message", "You have been logged out successfully.");
        return "redirect:/api/home";
    }
}
