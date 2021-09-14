package com.github.weberamaral.coffeeapi.coffee;

import com.github.weberamaral.coffeeapi.coffee.model.BrewingMethod;
import com.github.weberamaral.coffeeapi.coffee.port.BrewingMethodPort;
import com.github.weberamaral.coffeeapi.common.DomainComponent;
import com.github.weberamaral.coffeeapi.common.usecase.EmptyUseCaseHandler;
import lombok.RequiredArgsConstructor;

import java.util.List;

@DomainComponent
@RequiredArgsConstructor
public class AllBrewingMethodsUseCaseHandler implements EmptyUseCaseHandler<List<BrewingMethod>> {
  
  private final BrewingMethodPort brewingMethodPort;
  
  @Override
  public List<BrewingMethod> handle() {
    return brewingMethodPort.all();
  }
}
