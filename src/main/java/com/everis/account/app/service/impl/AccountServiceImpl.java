package com.everis.account.app.service.impl;

import com.everis.account.app.model.Card;
import com.everis.account.app.repository.AccountRepository;
import com.everis.account.app.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class AccountServiceImpl implements IAccountService {
    /**
     * inject AccountRepository.
     */
    @Autowired
    private AccountRepository repository;

    /**
     *
     * @param card
     * @return getAllAccounts.
     */
    @Override
    public Mono<Card> getAllAccounts(final String card) {
        return repository.getCardsResponse(card);
    }
}
