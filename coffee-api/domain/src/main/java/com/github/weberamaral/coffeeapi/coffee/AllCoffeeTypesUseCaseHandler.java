package com.github.weberamaral.coffeeapi.coffee;

import com.github.weberamaral.coffeeapi.coffee.model.CoffeeType;
import com.github.weberamaral.coffeeapi.coffee.port.CoffeeTypePort;
import com.github.weberamaral.coffeeapi.common.DomainComponent;
import com.github.weberamaral.coffeeapi.common.usecase.EmptyUseCaseHandler;
import lombok.RequiredArgsConstructor;

import java.util.List;

@DomainComponent
@RequiredArgsConstructor
public class AllCoffeeTypesUseCaseHandler implements EmptyUseCaseHandler<List<CoffeeType>> {
  
  private final CoffeeTypePort coffeeTypePort;
  
  @Override
  public List<CoffeeType> handle() {
    return coffeeTypePort.all();
  }
}
