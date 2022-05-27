package com.longpc.demographql2.resolver.bank;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.longpc.demographql2.dao.BankAccountDAO;
import com.longpc.demographql2.dao.ClientDAO;
import com.longpc.demographql2.domain.bank.BankAccount;
import com.longpc.demographql2.domain.bank.Client;
import com.longpc.demographql2.resolver.bank.query.BankAccountResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * 4:47 PM 5/18/2022
 * PHAM_LONG
 */
@Slf4j
@Component
public class ClientResolver implements GraphQLResolver<BankAccount> {
    public Client client(BankAccount bankAccount) {
        ClientDAO clientDAO = new ClientDAO();
        log.info("requesting client data for bank account id: {}", bankAccount.getId());
        return clientDAO.getClientByBankAccountId(bankAccount.getId());
    }
}
