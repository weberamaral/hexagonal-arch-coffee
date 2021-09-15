package com.github.weberamaral.coffeeworker.adapters.coffee.amqp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.weberamaral.coffeeworker.adapters.coffee.amqp.message.CoffeeCreatedMessage;
import com.github.weberamaral.coffeeworker.common.usecase.VoidUseCaseHandler;
import com.github.weberamaral.coffeeworker.configuration.CoffeeOrderAMQPConfiguration;
import com.github.weberamaral.coffeeworker.order.usecase.TakeCoffeeOrder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class CoffeeOrderConsumerAdapter {
  
  private final VoidUseCaseHandler<TakeCoffeeOrder> takeCoffeeOrderVoidUseCaseHandler;

  @RabbitListener(queues = CoffeeOrderAMQPConfiguration.QUEUE, containerFactory = "spFactory")
  public void consumer(Message message) throws JsonProcessingException {
    CoffeeCreatedMessage coffeeCreatedMessage = read(message);
    log.info("take coffee order {}", coffeeCreatedMessage);
    
    TakeCoffeeOrder takeCoffeeOrder = TakeCoffeeOrder.builder()
      .coffeeOrder(coffeeCreatedMessage.toModel())
      .build();
    
    takeCoffeeOrderVoidUseCaseHandler.handle(takeCoffeeOrder);
  }
  
  private CoffeeCreatedMessage read(Message message) throws JsonProcessingException {
    var converter = new Jackson2JsonMessageConverter();
    var messageConverted = converter.fromMessage(message);
    
    var objectMapper = new ObjectMapper();
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    objectMapper.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
    
    return objectMapper.readValue(messageConverted.toString(), CoffeeCreatedMessage.class);
  }
}

