package com.everis.account.app.controller;

import com.everis.account.app.model.Account;
import com.everis.account.app.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class AccountController {
    /**
     * inject IAccountService .
     */
    @Autowired
    private IAccountService service;

    /**
     *
     * @param cardNumber
     * @return getCard.
     */
    @GetMapping(value = "/core/accounts")
    public Mono<Account> getAccount(@RequestParam(name = "cardNumber") final String cardNumber) {
        return service.getAllAccounts(cardNumber)
                .flatMap(card -> {
                    Integer amount = 0;
                    if (cardNumber.endsWith("5")) {
                        amount = 1000;
                    } else if (cardNumber.endsWith("6")) {
                        amount = 500;
                    } else if (cardNumber.endsWith("0")) {
                        amount = 1500;
                    }
                    card.setAccount(new Account(cardNumber.concat("XXX"), amount));
                    return Mono.just(card);
                })
                .map(card -> new Account(card.getAccount().getAccountNumber(), card.getAccount().getAmount()))
                .delayElement(Duration.ofSeconds(5));
    }
}
