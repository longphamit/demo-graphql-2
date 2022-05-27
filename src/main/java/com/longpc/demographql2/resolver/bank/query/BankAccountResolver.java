package com.longpc.demographql2.resolver.bank.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.longpc.demographql2.dao.BankAccountDAO;
import com.longpc.demographql2.domain.bank.BankAccount;
import com.longpc.demographql2.domain.bank.Currency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * 2:37 PM 5/18/2022
 * PHAM_LONG
 */
@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {
    public BankAccount bankAccount(UUID id) {
        BankAccountDAO bankAccountDAO = new BankAccountDAO();
        log.info("retrieving bank account id: {}", id);
        return bankAccountDAO.getBankAccountById(id);
    }
}
