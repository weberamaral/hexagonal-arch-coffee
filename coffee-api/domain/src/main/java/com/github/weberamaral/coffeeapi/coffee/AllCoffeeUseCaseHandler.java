package com.github.weberamaral.coffeeapi.coffee;

import com.github.weberamaral.coffeeapi.coffee.model.Coffee;
import com.github.weberamaral.coffeeapi.coffee.port.CoffeePort;
import com.github.weberamaral.coffeeapi.common.DomainComponent;
import com.github.weberamaral.coffeeapi.common.usecase.EmptyUseCaseHandler;
import lombok.RequiredArgsConstructor;

import java.util.List;

@DomainComponent
@RequiredArgsConstructor
public class AllCoffeeUseCaseHandler implements EmptyUseCaseHandler<List<Coffee>> {
  
  private final CoffeePort coffeePort;
  
  @Override
  public List<Coffee> handle() {
    return coffeePort.all();
  }
}
