package com.github.weberamaral.coffeeapi.configuration;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoffeeOrderAMQPConfiguration {
  
  public static final String EXCHANGE_NAME = "CoffeeOrders";
  
  @Bean
  public Exchange declareExchange() {
    return ExchangeBuilder.directExchange(EXCHANGE_NAME)
      .durable(true)
      .build();
  }
}
