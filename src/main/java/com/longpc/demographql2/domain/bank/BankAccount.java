package com.longpc.demographql2.domain.bank;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.util.UUID;

/**
 * 2:40 PM 5/18/2022
 * PHAM_LONG
 */

@Value
@Builder
public class BankAccount {
   private UUID id;
   private Client client;
   private Currency currency;
}
