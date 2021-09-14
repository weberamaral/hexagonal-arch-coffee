package com.github.weberamaral.coffeeapi.coffee;

import com.github.weberamaral.coffeeapi.coffee.model.Coffee;
import com.github.weberamaral.coffeeapi.coffee.port.CoffeePort;
import com.github.weberamaral.coffeeapi.coffee.usecase.CreateCoffee;
import com.github.weberamaral.coffeeapi.common.DomainComponent;
import com.github.weberamaral.coffeeapi.common.usecase.UseCaseHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

@Slf4j
@DomainComponent
@RequiredArgsConstructor
public class CreateCoffeeUseCaseHandler implements UseCaseHandler<Coffee, CreateCoffee> {
  
  private final CoffeePort coffeePort;

  @Override
  public Coffee handle(CreateCoffee useCase) {
    var coffee = Coffee.builder()
      .id(UUID.randomUUID())
      .name(useCase.getName())
      .method(useCase.getMethod())
      .size(useCase.getSize())
      .type(useCase.getType())
      .build();
    
    log.info("Creating coffee with values {}", coffee);
    return coffeePort.create(coffee);
  }
}
