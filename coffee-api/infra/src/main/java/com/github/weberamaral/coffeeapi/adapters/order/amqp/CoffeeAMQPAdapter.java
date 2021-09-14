package com.github.weberamaral.coffeeapi.adapters.order.amqp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.weberamaral.coffeeapi.coffee.event.CoffeeCreatedEvent;
import com.github.weberamaral.coffeeapi.configuration.CoffeeOrderAMQPConfiguration;
import com.github.weberamaral.coffeeapi.order.port.CoffeeOrderCreatedEventPort;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CoffeeAMQPAdapter implements CoffeeOrderCreatedEventPort {
  
  private final RabbitTemplate rabbitTemplate;
  
  @Override
  public void publish(CoffeeCreatedEvent coffeeCreatedEvent) {
    try {
      String json = new ObjectMapper().writeValueAsString(coffeeCreatedEvent);
      rabbitTemplate.convertAndSend(CoffeeOrderAMQPConfiguration.EXCHANGE_NAME, "", json);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
  }
}
