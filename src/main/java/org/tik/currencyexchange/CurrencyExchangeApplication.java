package org.tik.currencyexchange;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.hibernate.SessionFactory;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;

@SpringBootApplication
public class CurrencyExchangeApplication {
    @Autowired
    CurrencyExchangeRepository currencyExchangeRepository;

    @PostConstruct
    public void setUp() {
        currencyExchangeRepository.save(new ExchangeValue(1L, "USD", "INR", BigDecimal.valueOf(65), 0));
        currencyExchangeRepository.save(new ExchangeValue(2L, "EUR", "INR", BigDecimal.valueOf(75), 0));
        currencyExchangeRepository.save(new ExchangeValue(3L, "AUD", "INR", BigDecimal.valueOf(25), 0));
    }

    public static void main(String[] args) {
        SpringApplication.run(CurrencyExchangeApplication.class, args);
    }

}
