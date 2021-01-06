package com.everis.account.app.service;

import com.everis.account.app.model.Card;
import reactor.core.publisher.Mono;

public interface IAccountService {
    /**
     *
     * @param card
     * @return getAllAccounts.
     */
    Mono<Card> getAllAccounts(String card);
}
