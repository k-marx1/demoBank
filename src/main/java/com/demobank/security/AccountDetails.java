package com.demobank.security;

import com.demobank.model.Account;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;


@AllArgsConstructor
public class AccountDetails implements UserDetails {
    private final Account account;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
         return null;
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }

    @Override
    public String getUsername() {
        return this.account.getUsername();
    }
}
