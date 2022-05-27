package com.longpc.demographql2.dao;

import com.longpc.demographql2.domain.bank.BankAccount;
import com.longpc.demographql2.domain.bank.Client;
import com.longpc.demographql2.domain.bank.Currency;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * 3:29 PM 5/18/2022
 * PHAM_LONG
 */
public class BankAccountDAO {
    public BankAccount getBankAccountById(UUID id) {
        return BankAccount.builder()
                .id(id)
                .currency(Currency.USD)
                .build();
    }
}
