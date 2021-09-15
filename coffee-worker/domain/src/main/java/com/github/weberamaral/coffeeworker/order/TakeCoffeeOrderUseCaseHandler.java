package com.github.weberamaral.coffeeworker.order;

import com.github.weberamaral.coffeeworker.common.DomainComponent;
import com.github.weberamaral.coffeeworker.common.usecase.VoidUseCaseHandler;
import com.github.weberamaral.coffeeworker.order.model.OrderStatus;
import com.github.weberamaral.coffeeworker.order.port.CoffeeOrderPort;
import com.github.weberamaral.coffeeworker.order.usecase.TakeCoffeeOrder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@DomainComponent
@RequiredArgsConstructor
@Slf4j
public class TakeCoffeeOrderUseCaseHandler implements VoidUseCaseHandler<TakeCoffeeOrder> {
  
  private final CoffeeOrderPort coffeeOrderPort;
  
  @Override
  public void handle(TakeCoffeeOrder useCase) {
    useCase.getCoffeeOrder().setStatus(OrderStatus.PREPARING);
    coffeeOrderPort.persist(useCase.getCoffeeOrder());
  }
}
