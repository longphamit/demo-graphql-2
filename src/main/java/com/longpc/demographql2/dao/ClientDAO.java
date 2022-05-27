package com.longpc.demographql2.dao;

import com.longpc.demographql2.domain.bank.BankAccount;
import com.longpc.demographql2.domain.bank.Client;
import com.longpc.demographql2.domain.bank.Currency;

import java.util.UUID;

/**
 * 4:48 PM 5/18/2022
 * PHAM_LONG
 */
public class ClientDAO {
    public Client getClientByBankAccountId(UUID id) {
        Client clientA = Client.builder()
                .id(UUID.randomUUID())
                .firstName("longpc-01")
                .lastName("Will")
                .build();
        Client clientB = Client.builder()
                .id(UUID.randomUUID())
                .firstName("longpc-02")
                .lastName("No")
                .build();
        return clientA;
    }
}
