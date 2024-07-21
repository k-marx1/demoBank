package com.demobank.security;

import com.demobank.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class AuthProvider implements AuthenticationProvider {

    private final AccountService accountService;


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();

        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}
