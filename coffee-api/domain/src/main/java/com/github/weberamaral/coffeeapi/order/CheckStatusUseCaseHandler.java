package com.github.weberamaral.coffeeapi.order;

import com.github.weberamaral.coffeeapi.common.DomainComponent;
import com.github.weberamaral.coffeeapi.common.usecase.UseCaseHandler;
import com.github.weberamaral.coffeeapi.order.model.OrderStatus;
import com.github.weberamaral.coffeeapi.order.port.CoffeeOrderPort;
import com.github.weberamaral.coffeeapi.order.usecase.CheckOrderStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@DomainComponent
@Slf4j
@RequiredArgsConstructor
public class CheckStatusUseCaseHandler implements UseCaseHandler<OrderStatus, CheckOrderStatus> {
  
  private final CoffeeOrderPort coffeeOrderPort;
  
  @Override
  public OrderStatus handle(CheckOrderStatus useCase) {
    return coffeeOrderPort.status(useCase.getOrderId());
  }
}
