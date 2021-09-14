package com.github.weberamaral.coffeeapi.order;

import com.github.weberamaral.coffeeapi.coffee.event.CoffeeCreatedEvent;
import com.github.weberamaral.coffeeapi.common.DomainComponent;
import com.github.weberamaral.coffeeapi.common.usecase.UseCaseHandler;
import com.github.weberamaral.coffeeapi.order.model.CoffeeOrder;
import com.github.weberamaral.coffeeapi.order.model.OrderStatus;
import com.github.weberamaral.coffeeapi.order.port.CoffeeOrderCreatedEventPort;
import com.github.weberamaral.coffeeapi.order.usecase.CreateCoffeeOrder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

@DomainComponent
@Slf4j
@RequiredArgsConstructor
public class CreateCoffeeOrderUseCaseHandler implements UseCaseHandler<CoffeeOrder, CreateCoffeeOrder> {
  
  private final CoffeeOrderCreatedEventPort coffeeOrderCreatedEventPort;
  
  @Override
  public CoffeeOrder handle(CreateCoffeeOrder useCase) {
    CoffeeOrder coffeeOrder = CoffeeOrder.builder()
      .id(UUID.randomUUID())
      .customerName(useCase.getCustomerName())
      .coffee(useCase.getCoffee())
      .status(OrderStatus.PENDING)
      .build();
    
    log.info("Creating coffee order with status PENDING. {}", coffeeOrder);
    
    coffeeOrderCreatedEventPort.publish(CoffeeCreatedEvent.from(coffeeOrder));
    log.info("Publishing coffee order to prepare.");
    
    return coffeeOrder;
  }
}
