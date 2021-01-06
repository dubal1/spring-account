package com.everis.account.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    /**
     * field accountNumber.
     */
    private String accountNumber;
    /**
     * field amount.
     */
    private Integer amount;
}
