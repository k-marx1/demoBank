package com.demobank.service;


import com.demobank.repository.AccountRepository;
import com.demobank.model.Account;
import com.demobank.security.AccountDetails;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Transactional
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

}
