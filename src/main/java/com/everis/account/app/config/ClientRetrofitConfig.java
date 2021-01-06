package com.everis.account.app.config;

import com.everis.account.app.repository.AccountRepository;
import com.jakewharton.retrofit2.adapter.reactor.ReactorCallAdapterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class ClientRetrofitConfig {
    /**
     *
     * @return repository.
     */
    @Bean
    AccountRepository repository() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:9003")
                .addCallAdapterFactory(ReactorCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(AccountRepository.class);
    }
}
