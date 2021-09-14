package com.github.weberamaral.coffeeapi.coffee;

import com.github.weberamaral.coffeeapi.coffee.model.CoffeeSize;
import com.github.weberamaral.coffeeapi.coffee.port.CoffeeSizePort;
import com.github.weberamaral.coffeeapi.common.DomainComponent;
import com.github.weberamaral.coffeeapi.common.usecase.EmptyUseCaseHandler;
import lombok.RequiredArgsConstructor;

import java.util.List;

@DomainComponent
@RequiredArgsConstructor
public class AllCoffeeSizesUseCaseHandler implements EmptyUseCaseHandler<List<CoffeeSize>> {
  
  private final CoffeeSizePort coffeeSizePort;
  
  @Override
  public List<CoffeeSize> handle() {
    return coffeeSizePort.all();
  }
}
