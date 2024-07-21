package com.demobank.service;

import com.demobank.model.Account;
import com.demobank.repository.AccountRepository;
import com.demobank.security.AccountDetails;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;


@AllArgsConstructor
public class AccountDetailsService implements UserDetailsService {

    private AccountRepository accountRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Account> account = accountRepository.findByUsername(username);

        if (account.isEmpty()) {
            throw new UsernameNotFoundException("User not found");
        }

        return new AccountDetails(account.get());
    }
}
