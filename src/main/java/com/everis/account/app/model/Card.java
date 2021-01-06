package com.everis.account.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    /**
     * field cardNumber.
     */
    private String cardNumber;
    /**
     * active.
     */
    private Boolean active;
    /**
     * list accounts.
     */
    private Account account;
}
