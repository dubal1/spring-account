package com.everis.account.app.repository;

import com.everis.account.app.model.Card;
import reactor.core.publisher.Mono;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AccountRepository {
    /**
     *
     * @param cardNumber .
     * @return savePerson.
     */
    @GET("/core/cards/response")
    Mono<Card> getCardsResponse(@Query(value = "cardNumber") String cardNumber);
}
