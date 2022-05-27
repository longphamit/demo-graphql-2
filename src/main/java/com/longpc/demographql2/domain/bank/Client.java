package com.longpc.demographql2.domain.bank;

import lombok.*;

import java.util.List;
import java.util.UUID;

/**
 * 3:06 PM 5/18/2022
 * PHAM_LONG
 */
@Builder
@Data
public class Client {
    private UUID id;
    private String firstName;
    private List<String> midlleNames;
    private String lastName;
    private Client client;
}
