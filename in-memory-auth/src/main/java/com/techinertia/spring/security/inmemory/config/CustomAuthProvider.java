package com.techinertia.spring.security.inmemory.config;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class CustomAuthProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication)
            throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials()
                .toString();

        if ("userext".equals(username) && "pass".equals(password)) {
            return new UsernamePasswordAuthenticationToken(username, password, getAuthorities());
        } else {
            throw new BadCredentialsException("Custom Authentication Failed");
        }
    }

    /*
    Provide authorities to your users
     */
    private List<GrantedAuthority> getAuthorities(){

        List<GrantedAuthority> AUTHORITIES = new ArrayList<>();
        AUTHORITIES.add(new SimpleGrantedAuthority("ROLE_USER"));

        return AUTHORITIES;
    }

    @Override
    public boolean supports(Class<?> auth) {
        return auth.equals(UsernamePasswordAuthenticationToken.class);
    }
}
