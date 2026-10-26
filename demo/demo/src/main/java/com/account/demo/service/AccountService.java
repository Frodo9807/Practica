package com.account.demo.service;

import org.springframework.stereotype.Service;

import com.account.demo.entity.Account;
import com.account.demo.repository.AccountRepo;

@Service
public class AccountService {

    private final AccountRepo accountRepo;

    public AccountService(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    public Account createAccount(Account account) {
        return accountRepo.save(account);
    }
}
